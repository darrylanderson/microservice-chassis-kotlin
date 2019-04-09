package atc.chassis.config.jpa

import org.springframework.data.domain.AuditorAware
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import java.util.*


/**
 * Spring auditor implementation to support automatic population of createdBy and lastModifiedBy fields.
 */
class AuditorAwareImpl : AuditorAware<String> {

    override fun getCurrentAuditor(): Optional<String> {
        val authentication = SecurityContextHolder.getContext().authentication

        if (authentication == null || !authentication.isAuthenticated || authentication.principal !is UserDetails) {
            return Optional.empty()
        }

        val userDetails = authentication.principal as UserDetails
        return Optional.of(userDetails.username)
    }
}
