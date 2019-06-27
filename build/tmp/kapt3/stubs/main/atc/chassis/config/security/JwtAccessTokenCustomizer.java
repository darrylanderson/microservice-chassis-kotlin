package atc.chassis.config.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u00030\rH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Latc/chassis/config/security/JwtAccessTokenCustomizer;", "Lorg/springframework/security/oauth2/provider/token/DefaultAccessTokenConverter;", "Lorg/springframework/boot/autoconfigure/security/oauth2/resource/JwtAccessTokenConverterConfigurer;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "configure", "", "converter", "Lorg/springframework/security/oauth2/provider/token/store/JwtAccessTokenConverter;", "extractAuthentication", "Lorg/springframework/security/oauth2/provider/OAuth2Authentication;", "tokenMap", "", "", "extractClients", "", "jwt", "Lcom/fasterxml/jackson/databind/JsonNode;", "extractRoles", "", "Lorg/springframework/security/core/GrantedAuthority;", "Companion", "microservice-chassis-kotlin"})
public final class JwtAccessTokenCustomizer extends org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter implements org.springframework.boot.autoconfigure.security.oauth2.resource.JwtAccessTokenConverterConfigurer {
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private static final org.slf4j.Logger log = null;
    private static final java.lang.String CLIENT_NAME_ELEMENT_IN_JWT = "resource_access";
    private static final java.lang.String ROLE_ELEMENT_IN_JWT = "roles";
    public static final atc.chassis.config.security.JwtAccessTokenCustomizer.Companion Companion = null;
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter converter) {
    }
    
    /**
     * Spring oauth2 expects roles under authorities element in tokenMap, but keycloak provides it under resource_access. Hence extractAuthentication
     * method is overriden to extract roles from resource_access.
     *
     * @return OAuth2Authentication with authorities for given application
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.oauth2.provider.OAuth2Authentication extractAuthentication(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ?> tokenMap) {
        return null;
    }
    
    private final java.util.List<org.springframework.security.core.GrantedAuthority> extractRoles(com.fasterxml.jackson.databind.JsonNode jwt) {
        return null;
    }
    
    private final java.util.Set<java.lang.String> extractClients(com.fasterxml.jackson.databind.JsonNode jwt) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public JwtAccessTokenCustomizer(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Latc/chassis/config/security/JwtAccessTokenCustomizer$Companion;", "", "()V", "CLIENT_NAME_ELEMENT_IN_JWT", "", "ROLE_ELEMENT_IN_JWT", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}