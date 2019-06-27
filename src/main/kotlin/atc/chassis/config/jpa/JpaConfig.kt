package atc.chassis.config.jpa

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.auditing.DateTimeProvider
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.time.OffsetDateTime
import java.util.*


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = ["atc.chassis.domain.repository"])
@EnableJpaAuditing(dateTimeProviderRef = "auditingDateTimeProvider")
class JpaConfig {

    @Bean
    fun auditorProvider(): AuditorAware<String> {
        return AuditorAwareImpl()
    }

    /**
     * Spring audit doesn't pick up the normal JPA Jsr310 converters, so we have to manually do it here.
     *
     * @return a DateTimeProvider
     */
    @Bean(name = ["auditingDateTimeProvider"])
    fun dateTimeProvider(): DateTimeProvider {
        return DateTimeProvider { Optional.of(OffsetDateTime.now()) }
    }

}
