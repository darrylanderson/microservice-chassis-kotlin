package atc.chassis.config.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0017J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Latc/chassis/config/security/OAuth2ResourceServerConfig;", "Lorg/springframework/security/oauth2/config/annotation/web/configuration/ResourceServerConfigurerAdapter;", "()V", "resourceServerProperties", "Lorg/springframework/boot/autoconfigure/security/oauth2/resource/ResourceServerProperties;", "getResourceServerProperties", "()Lorg/springframework/boot/autoconfigure/security/oauth2/resource/ResourceServerProperties;", "setResourceServerProperties", "(Lorg/springframework/boot/autoconfigure/security/oauth2/resource/ResourceServerProperties;)V", "securityProperties", "Latc/chassis/config/security/SecurityProperties;", "getSecurityProperties", "()Latc/chassis/config/security/SecurityProperties;", "setSecurityProperties", "(Latc/chassis/config/security/SecurityProperties;)V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "resources", "Lorg/springframework/security/oauth2/config/annotation/web/configurers/ResourceServerSecurityConfigurer;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "jwtAccessTokenCustomizer", "Latc/chassis/config/security/JwtAccessTokenCustomizer;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Companion", "OAuthRestTemplateConfigurer", "microservice-chassis-kotlin"})
@org.springframework.context.annotation.Import(value = {atc.chassis.config.security.SecurityProperties.class})
@org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(prefix = "rest.security", havingValue = "true", value = {"enabled"})
@org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer()
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.context.annotation.Configuration()
public class OAuth2ResourceServerConfig extends org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties resourceServerProperties;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public atc.chassis.config.security.SecurityProperties securityProperties;
    private static final org.slf4j.Logger log = null;
    public static final atc.chassis.config.security.OAuth2ResourceServerConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties getResourceServerProperties() {
        return null;
    }
    
    public void setResourceServerProperties(@org.jetbrains.annotations.NotNull()
    org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.config.security.SecurityProperties getSecurityProperties() {
        return null;
    }
    
    public void setSecurityProperties(@org.jetbrains.annotations.NotNull()
    atc.chassis.config.security.SecurityProperties p0) {
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer resources) throws java.lang.Exception {
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public atc.chassis.config.security.JwtAccessTokenCustomizer jwtAccessTokenCustomizer(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
    
    public OAuth2ResourceServerConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Latc/chassis/config/security/OAuth2ResourceServerConfig$OAuthRestTemplateConfigurer;", "", "()V", "oauth2RestTemplate", "Lorg/springframework/security/oauth2/client/OAuth2RestTemplate;", "details", "Lorg/springframework/security/oauth2/client/resource/OAuth2ProtectedResourceDetails;", "microservice-chassis-kotlin"})
    @org.springframework.boot.autoconfigure.condition.ConditionalOnProperty(prefix = "security.oauth2.client", havingValue = "client_credentials", value = {"grant-type"})
    @org.springframework.context.annotation.Configuration()
    public static class OAuthRestTemplateConfigurer {
        
        @org.jetbrains.annotations.NotNull()
        @org.springframework.context.annotation.Bean()
        public org.springframework.security.oauth2.client.OAuth2RestTemplate oauth2RestTemplate(@org.jetbrains.annotations.NotNull()
        org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails details) {
            return null;
        }
        
        public OAuthRestTemplateConfigurer() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Latc/chassis/config/security/OAuth2ResourceServerConfig$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}