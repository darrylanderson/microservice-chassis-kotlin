package atc.chassis.config.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b\u00a8\u0006\u001b"}, d2 = {"Latc/chassis/config/security/SecurityProperties;", "", "()V", "apiMatcher", "", "getApiMatcher", "()Ljava/lang/String;", "setApiMatcher", "(Ljava/lang/String;)V", "cors", "Latc/chassis/config/security/SecurityProperties$Cors;", "getCors", "()Latc/chassis/config/security/SecurityProperties$Cors;", "corsConfiguration", "Lorg/springframework/web/cors/CorsConfiguration;", "getCorsConfiguration", "()Lorg/springframework/web/cors/CorsConfiguration;", "isEnabled", "", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "issuerUri", "getIssuerUri", "setIssuerUri", "Cors", "microservice-chassis-kotlin"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "rest.security")
@org.springframework.context.annotation.Configuration()
@org.springframework.stereotype.Component()
public class SecurityProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isEnabled;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String apiMatcher;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String issuerUri;
    @org.jetbrains.annotations.NotNull()
    private final atc.chassis.config.security.SecurityProperties.Cors cors = null;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Boolean isEnabled() {
        return null;
    }
    
    public void setEnabled(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getApiMatcher() {
        return null;
    }
    
    public void setApiMatcher(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getIssuerUri() {
        return null;
    }
    
    public void setIssuerUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.config.security.SecurityProperties.Cors getCors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.cors.CorsConfiguration getCorsConfiguration() {
        return null;
    }
    
    public SecurityProperties() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006!"}, d2 = {"Latc/chassis/config/security/SecurityProperties$Cors;", "", "()V", "allowCredentials", "", "getAllowCredentials", "()Ljava/lang/Boolean;", "setAllowCredentials", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "allowedHeaders", "", "", "getAllowedHeaders", "()Ljava/util/List;", "setAllowedHeaders", "(Ljava/util/List;)V", "allowedMethods", "getAllowedMethods", "setAllowedMethods", "allowedOrigins", "getAllowedOrigins", "setAllowedOrigins", "exposedHeaders", "getExposedHeaders", "setExposedHeaders", "maxAge", "", "getMaxAge", "()Ljava/lang/Long;", "setMaxAge", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "microservice-chassis-kotlin"})
    public static final class Cors {
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> allowedOrigins;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> allowedMethods;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> allowedHeaders;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<java.lang.String> exposedHeaders;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean allowCredentials;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long maxAge;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getAllowedOrigins() {
            return null;
        }
        
        public final void setAllowedOrigins(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getAllowedMethods() {
            return null;
        }
        
        public final void setAllowedMethods(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getAllowedHeaders() {
            return null;
        }
        
        public final void setAllowedHeaders(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getExposedHeaders() {
            return null;
        }
        
        public final void setExposedHeaders(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getAllowCredentials() {
            return null;
        }
        
        public final void setAllowCredentials(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getMaxAge() {
            return null;
        }
        
        public final void setMaxAge(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        public Cors() {
            super();
        }
    }
}