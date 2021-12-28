package atc.chassis.doc

import atc.chassis.exception.ApiError
import com.fasterxml.classmate.TypeResolver
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.core.Authentication
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMethod
import springfox.documentation.builders.*
import springfox.documentation.schema.ModelRef
import springfox.documentation.service.*
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

/**
 * Configuration for the Swagger API documentation.
 */
@Configuration
@EnableSwagger2
@ComponentScan("atc.chassis")
class SwaggerConfig {

  //    @Value("${uaa.clientId}")
  internal var clientId = "clientId"

  //    @Value("${uaa.clientSecret}")
  internal var clientSecret = "clientSecret"

  //    @Value( "${uaa.url}")
  internal var oAuthServerUri = "https://myoauthhost.com"

  private val globalResponseMessages: List<ResponseMessage>
    get() = listOf(
      ResponseMessageBuilder()
        .code(HttpStatus.UNAUTHORIZED.value())
        .message("Invalid or missing credentials")
        .responseModel(ModelRef("ApiError"))
        .build(),
      ResponseMessageBuilder()
        .code(HttpStatus.FORBIDDEN.value())
        .message("User not authorized to perform this operation")
        .responseModel(ModelRef("ApiError"))
        .build(),
      ResponseMessageBuilder()
        .code(HttpStatus.BAD_REQUEST.value())
        .message("Invalid request")
        .responseModel(ModelRef("ApiError"))
        .build(),
    )

  /**
   * Configure the springfox Docket to scan for our controllers.
   *
   * @return a Docket object
   */
  @Bean
  fun buildDocket(): Docket {
    val apiVersion = "1.0.0"

    val docket = Docket(DocumentationType.SWAGGER_2)
      .groupName(apiVersion)
      .securitySchemes(listOf(oauthSecurityScheme(), apiKeySecurityScheme()))
      .protocols(setOf("https"))
      .select()
      .apis(RequestHandlerSelectors.basePackage("atc.chassis"))
      .paths(PathSelectors.regex("/api/v1/.*"))
      .build()
      .produces(setOf("application/json"))
      .genericModelSubstitutes(ResponseEntity::class.java)
      .useDefaultResponseMessages(false)
      .additionalModels(TypeResolver().resolve(ApiError::class.java))
      .globalResponseMessage(RequestMethod.GET, globalResponseMessages)
      .globalResponseMessage(RequestMethod.POST, globalResponseMessages)
      .globalResponseMessage(RequestMethod.PUT, globalResponseMessages)
      .globalResponseMessage(RequestMethod.DELETE, globalResponseMessages)
      .directModelSubstitute(LocalDate::class.java, java.sql.Date::class.java)
      .directModelSubstitute(LocalDateTime::class.java, java.util.Date::class.java)
      .directModelSubstitute(LocalTime::class.java, java.lang.String::class.java)

    docket.ignoredParameterTypes(Authentication::class.java, ModelMap::class.java)

    docket.tags(
      Tag(SwaggerTags.CONTACTS, "Contacts API"),
    )

    return docket
  }

  private fun oauthSecurityScheme(): SecurityScheme {
    return OAuthBuilder()
      .name("OAuth2")
      .scopes(oauthScopes())
      .grantTypes(oauthGrantTypes())
      .build()
  }

  private fun apiKeySecurityScheme(): SecurityScheme {
    return BasicAuth("ApiKey")
  }

  private fun oauthGrantTypes(): List<GrantType> {
    val grantTypes = ArrayList<GrantType>()
    val tokenRequestEndpoint = TokenRequestEndpoint("$oAuthServerUri/oauth/authorize", clientId, clientSecret)
    val tokenEndpoint = TokenEndpoint("$oAuthServerUri/oauth/token", "token")
    grantTypes.add(AuthorizationCodeGrant(tokenRequestEndpoint, tokenEndpoint))
    return grantTypes
  }

  private fun oauthScopes(): List<AuthorizationScope> {
    val list = ArrayList<AuthorizationScope>()
    list.add(AuthorizationScope("read:contacts", "Grants read access to contact"))
    list.add(AuthorizationScope("write:contacts", "Grants write access to contacts"))
    return list
  }

  companion object {
    private val log = LoggerFactory.getLogger(SwaggerConfig::class.java)
  }
}
