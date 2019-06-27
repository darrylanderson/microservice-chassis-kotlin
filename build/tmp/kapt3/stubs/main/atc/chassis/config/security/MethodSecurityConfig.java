package atc.chassis.config.security;

import java.lang.System;

/**
 * Allows for @PreAuthorize annotation processing.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014\u00a8\u0006\u0005"}, d2 = {"Latc/chassis/config/security/MethodSecurityConfig;", "Lorg/springframework/security/config/annotation/method/configuration/GlobalMethodSecurityConfiguration;", "()V", "createExpressionHandler", "Lorg/springframework/security/access/expression/method/MethodSecurityExpressionHandler;", "microservice-chassis-kotlin"})
@org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity(prePostEnabled = true)
@org.springframework.context.annotation.Configuration()
public class MethodSecurityConfig extends org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.springframework.security.access.expression.method.MethodSecurityExpressionHandler createExpressionHandler() {
        return null;
    }
    
    public MethodSecurityConfig() {
        super();
    }
}