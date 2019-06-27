package atc.chassis.config.jpa;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0017J\b\u0010\u0006\u001a\u00020\u0007H\u0017\u00a8\u0006\b"}, d2 = {"Latc/chassis/config/jpa/JpaConfig;", "", "()V", "auditorProvider", "Lorg/springframework/data/domain/AuditorAware;", "", "dateTimeProvider", "Lorg/springframework/data/auditing/DateTimeProvider;", "microservice-chassis-kotlin"})
@org.springframework.data.jpa.repository.config.EnableJpaAuditing(dateTimeProviderRef = "auditingDateTimeProvider")
@org.springframework.data.jpa.repository.config.EnableJpaRepositories(basePackages = {"atc.chassis.domain.repository"})
@org.springframework.transaction.annotation.EnableTransactionManagement()
@org.springframework.context.annotation.Configuration()
public class JpaConfig {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.data.domain.AuditorAware<java.lang.String> auditorProvider() {
        return null;
    }
    
    /**
     * Spring audit doesn't pick up the normal JPA Jsr310 converters, so we have to manually do it here.
     *
     * @return a DateTimeProvider
     */
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean(name = {"auditingDateTimeProvider"})
    public org.springframework.data.auditing.DateTimeProvider dateTimeProvider() {
        return null;
    }
    
    public JpaConfig() {
        super();
    }
}