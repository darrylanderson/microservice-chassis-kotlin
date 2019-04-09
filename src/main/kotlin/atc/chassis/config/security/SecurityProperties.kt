package atc.chassis.config.security

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.cors.CorsConfiguration


@Component
@Configuration
@ConfigurationProperties(prefix = "rest.security")
class SecurityProperties {

    var isEnabled: Boolean? = true

    lateinit var apiMatcher: String

    lateinit var issuerUri: String

    val cors = Cors()

    val corsConfiguration: CorsConfiguration
        get() {
            val corsConfiguration = CorsConfiguration()
            corsConfiguration.allowedOrigins = this.cors.allowedOrigins
            corsConfiguration.allowedMethods = this.cors.allowedMethods
            corsConfiguration.allowedHeaders = this.cors.allowedHeaders
            corsConfiguration.exposedHeaders = this.cors.exposedHeaders
            corsConfiguration.allowCredentials = this.cors.allowCredentials
            corsConfiguration.maxAge = this.cors.maxAge

            return corsConfiguration
        }


    class Cors {
        var allowedOrigins: List<String>? = null
        var allowedMethods: List<String>? = null
        var allowedHeaders: List<String>? = null
        var exposedHeaders: List<String>? = null
        var allowCredentials: Boolean? = null
        var maxAge: Long? = null
    }

}