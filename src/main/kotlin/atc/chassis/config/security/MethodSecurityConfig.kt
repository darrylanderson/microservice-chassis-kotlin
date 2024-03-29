package atc.chassis.config.security

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler

/**
 * Allows for @PreAuthorize annotation processing.
 */
@Configuration
@ConditionalOnProperty(prefix = "rest.security", value = ["enabled"], havingValue = "true")
@EnableGlobalMethodSecurity(prePostEnabled = true)
class MethodSecurityConfig : GlobalMethodSecurityConfiguration() {

  override fun createExpressionHandler(): MethodSecurityExpressionHandler {
    return OAuth2MethodSecurityExpressionHandler()
  }
}
