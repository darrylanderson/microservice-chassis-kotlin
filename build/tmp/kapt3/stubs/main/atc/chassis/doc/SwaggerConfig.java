package atc.chassis.doc;

import java.lang.System;

/**
 * Configuration for the Swagger API documentation.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0012J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\rH\u0012J\b\u0010\u001c\u001a\u00020\u0015H\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8RX\u0092\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b\u00a8\u0006\u001e"}, d2 = {"Latc/chassis/doc/SwaggerConfig;", "", "()V", "clientId", "", "getClientId$microservice_chassis_kotlin", "()Ljava/lang/String;", "setClientId$microservice_chassis_kotlin", "(Ljava/lang/String;)V", "clientSecret", "getClientSecret$microservice_chassis_kotlin", "setClientSecret$microservice_chassis_kotlin", "globalResponseMessages", "", "Lspringfox/documentation/service/ResponseMessage;", "getGlobalResponseMessages", "()Ljava/util/List;", "oAuthServerUri", "getOAuthServerUri$microservice_chassis_kotlin", "setOAuthServerUri$microservice_chassis_kotlin", "apiKeySecurityScheme", "Lspringfox/documentation/service/SecurityScheme;", "buildDocket", "Lspringfox/documentation/spring/web/plugins/Docket;", "oauthGrantTypes", "Lspringfox/documentation/service/GrantType;", "oauthScopes", "Lspringfox/documentation/service/AuthorizationScope;", "oauthSecurityScheme", "Companion", "microservice-chassis-kotlin"})
@org.springframework.context.annotation.ComponentScan(value = {"atc.chassis"})
@springfox.documentation.swagger2.annotations.EnableSwagger2()
@org.springframework.context.annotation.Configuration()
public class SwaggerConfig {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clientId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clientSecret;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oAuthServerUri;
    private static final org.slf4j.Logger log = null;
    public static final atc.chassis.doc.SwaggerConfig.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getClientId$microservice_chassis_kotlin() {
        return null;
    }
    
    public void setClientId$microservice_chassis_kotlin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getClientSecret$microservice_chassis_kotlin() {
        return null;
    }
    
    public void setClientSecret$microservice_chassis_kotlin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getOAuthServerUri$microservice_chassis_kotlin() {
        return null;
    }
    
    public void setOAuthServerUri$microservice_chassis_kotlin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private java.util.List<springfox.documentation.service.ResponseMessage> getGlobalResponseMessages() {
        return null;
    }
    
    /**
     * Configure the springfox Docket to scan for our controllers.
     *
     * @return a Docket object
     */
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public springfox.documentation.spring.web.plugins.Docket buildDocket() {
        return null;
    }
    
    private springfox.documentation.service.SecurityScheme oauthSecurityScheme() {
        return null;
    }
    
    private springfox.documentation.service.SecurityScheme apiKeySecurityScheme() {
        return null;
    }
    
    private java.util.List<springfox.documentation.service.GrantType> oauthGrantTypes() {
        return null;
    }
    
    private java.util.List<springfox.documentation.service.AuthorizationScope> oauthScopes() {
        return null;
    }
    
    public SwaggerConfig() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Latc/chassis/doc/SwaggerConfig$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}