package atc.chassis.config.security

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.oauth2.resource.JwtAccessTokenConverterConfigurer
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.security.oauth2.provider.OAuth2Request
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
import java.util.*


class JwtAccessTokenCustomizer
@Autowired constructor(private val mapper: ObjectMapper) : DefaultAccessTokenConverter(),
    JwtAccessTokenConverterConfigurer {

    init {
        log.info("Initialized {}", JwtAccessTokenCustomizer::class.java.simpleName)
    }

    override fun configure(converter: JwtAccessTokenConverter) {
        converter.accessTokenConverter = this
        log.info("Configured {}", JwtAccessTokenConverter::class.java.simpleName)
    }

    /**
     * Spring oauth2 expects roles under authorities element in tokenMap, but keycloak provides it under resource_access. Hence extractAuthentication
     * method is overriden to extract roles from resource_access.
     *
     * @return OAuth2Authentication with authorities for given application
     */
    override fun extractAuthentication(tokenMap: Map<String, *>): OAuth2Authentication {
        log.debug("Begin extractAuthentication: tokenMap = {}", tokenMap)
        val token = mapper.convertValue(tokenMap, JsonNode::class.java)
        val audienceList = extractClients(token) // extracting client names
        val authorities = extractRoles(token) // extracting client roles

        val authentication = super.extractAuthentication(tokenMap)
        val oAuth2Request = authentication.oAuth2Request

        val request = OAuth2Request(
            oAuth2Request.requestParameters, oAuth2Request.clientId, authorities, true, oAuth2Request.scope,
            audienceList, null, null, null
        )

        val usernamePasswordAuthentication =
            UsernamePasswordAuthenticationToken(authentication.principal, "N/A", authorities)
        log.debug("End extractAuthentication")
        return OAuth2Authentication(request, usernamePasswordAuthentication)
    }

    private fun extractRoles(jwt: JsonNode): List<GrantedAuthority> {
        log.debug("Begin extractRoles: jwt = {}", jwt)
        val rolesWithPrefix = HashSet<String>()

        jwt.path(CLIENT_NAME_ELEMENT_IN_JWT)
            .elements()
            .forEachRemaining { e ->
                e.path(ROLE_ELEMENT_IN_JWT)
                    .elements()
                    .forEachRemaining { r -> rolesWithPrefix.add("ROLE_" + r.asText()) }
            }

        val authorityList = AuthorityUtils.createAuthorityList(*rolesWithPrefix.toTypedArray())
        log.debug("End extractRoles: roles = {}", authorityList)
        return authorityList
    }

    private fun extractClients(jwt: JsonNode): Set<String> {
        log.debug("Begin extractClients: jwt = {}", jwt)
        if (jwt.has(CLIENT_NAME_ELEMENT_IN_JWT)) {
            val resourceAccessJsonNode = jwt.path(CLIENT_NAME_ELEMENT_IN_JWT)
            val clientNames = HashSet<String>()
            resourceAccessJsonNode.fieldNames()
                .forEachRemaining { clientNames.add(it) }

            log.debug("End extractClients: clients = {}", clientNames)
            return clientNames

        } else {
            throw IllegalArgumentException("Expected element $CLIENT_NAME_ELEMENT_IN_JWT not found in token")
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(JwtAccessTokenCustomizer::class.java)

        private const val CLIENT_NAME_ELEMENT_IN_JWT = "resource_access"

        private const val ROLE_ELEMENT_IN_JWT = "roles"
    }
}
