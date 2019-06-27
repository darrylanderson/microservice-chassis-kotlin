package atc.chassis.config.jpa;

import java.lang.System;

/**
 * Spring auditor implementation to support automatic population of createdBy and lastModifiedBy fields.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Latc/chassis/config/jpa/AuditorAwareImpl;", "Lorg/springframework/data/domain/AuditorAware;", "", "()V", "getCurrentAuditor", "Ljava/util/Optional;", "microservice-chassis-kotlin"})
public final class AuditorAwareImpl implements org.springframework.data.domain.AuditorAware<java.lang.String> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Optional<java.lang.String> getCurrentAuditor() {
        return null;
    }
    
    public AuditorAwareImpl() {
        super();
    }
}