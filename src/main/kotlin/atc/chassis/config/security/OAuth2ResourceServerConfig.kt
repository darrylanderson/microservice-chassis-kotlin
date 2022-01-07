package atc.chassis.config.security

import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
@EnableWebSecurity
@EnableResourceServer
@ConditionalOnProperty(prefix = "rest.security", value = ["enabled"], havingValue = "true")
@Import(SecurityProperties::class)
class OAuth2ResourceServerConfig : ResourceServerConfigurerAdapter() {

  @Autowired
  lateinit var resourceServerProperties: ResourceServerProperties

  @Autowired
  lateinit var securityProperties: SecurityProperties

  @Throws(Exception::class)
  override fun configure(resources: ResourceServerSecurityConfigurer) {
    resources.resourceId(resourceServerProperties.resourceId)
  }

  @Throws(Exception::class)
  override fun configure(http: HttpSecurity) {
    http.cors().configurationSource(corsConfigurationSource())
      .and()
      .headers().frameOptions().disable()
      .and()
      .csrf().disable()
      .authorizeRequests()
      .antMatchers(securityProperties.apiMatcher)
      .authenticated()
  }

  @Bean
  fun jwtAccessTokenCustomizer(mapper: ObjectMapper): JwtAccessTokenCustomizer {
    return JwtAccessTokenCustomizer(mapper)
  }

  @Bean
  fun corsConfigurationSource(): CorsConfigurationSource {
    val source = UrlBasedCorsConfigurationSource()
    source.registerCorsConfiguration("/**", securityProperties.corsConfiguration)
    return source
  }

  @Configuration
  @ConditionalOnProperty(
    prefix = "security.oauth2.client",
    value = ["grant-type"],
    havingValue = "client_credentials",
  )
  class OAuthRestTemplateConfigurer {

    @Bean
    fun oauth2RestTemplate(details: OAuth2ProtectedResourceDetails): OAuth2RestTemplate {
      val oAuth2RestTemplate = OAuth2RestTemplate(details)

      log.debug("Begin OAuth2RestTemplate: getAccessToken")
      /* To validate if required configurations are in place during startup */
      // oAuth2RestTemplate.accessToken
      log.debug("End OAuth2RestTemplate: getAccessToken")
      return oAuth2RestTemplate
    }
  }

  companion object {
    private val log = LoggerFactory.getLogger(OAuth2ResourceServerConfig::class.java)
  }
}
