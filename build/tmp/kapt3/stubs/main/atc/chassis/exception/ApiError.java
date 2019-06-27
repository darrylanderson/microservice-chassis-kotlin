package atc.chassis.exception;

import java.lang.System;

/**
 * Model for all errors that occur during API execution and result in a 4xx or 5xx HTTP status code.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b\u00a8\u0006\u001f"}, d2 = {"Latc/chassis/exception/ApiError;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "details", "", "Latc/chassis/exception/ErrorMessage;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "httpMessage", "getHttpMessage", "setHttpMessage", "httpStatusCode", "", "getHttpStatusCode", "()Ljava/lang/Integer;", "setHttpStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "supportReferenceId", "getSupportReferenceId", "setSupportReferenceId", "toString", "Builder", "microservice-chassis-kotlin"})
@io.swagger.annotations.ApiModel(description = "Representation of an error that occurs during API execution and results in a 4xx or 5xx HTTP status code.")
public final class ApiError {
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "The value of the HTTP status code.", position = 10)
    private java.lang.Integer httpStatusCode;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "Description of the HTTP status code.", position = 11)
    private java.lang.String httpMessage;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "Description of the error.", position = 20)
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "An optional list of ErrorMessage objects which provide further details as to the cause of this error.", position = 30)
    private java.util.List<atc.chassis.exception.ErrorMessage> details;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "A reference identifier used by support to assist with certain error messages.", position = 40)
    private java.lang.String supportReferenceId;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHttpStatusCode() {
        return null;
    }
    
    public final void setHttpStatusCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHttpMessage() {
        return null;
    }
    
    public final void setHttpMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<atc.chassis.exception.ErrorMessage> getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.Nullable()
    java.util.List<atc.chassis.exception.ErrorMessage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSupportReferenceId() {
        return null;
    }
    
    public final void setSupportReferenceId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiError() {
        super();
    }
    
    /**
     * Convenience fluent Builder class for constructing ApiError objects.
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Latc/chassis/exception/ApiError$Builder;", "", "()V", "description", "", "details", "", "Latc/chassis/exception/ErrorMessage;", "httpMessage", "httpStatusCode", "", "Ljava/lang/Integer;", "supportReferenceId", "build", "Latc/chassis/exception/ApiError;", "withDescription", "withDetails", "withHttpMessage", "withHttpStatusCode", "(Ljava/lang/Integer;)Latc/chassis/exception/ApiError$Builder;", "withSupportReferenceId", "Companion", "microservice-chassis-kotlin"})
    public static final class Builder {
        private java.lang.Integer httpStatusCode;
        private java.lang.String httpMessage;
        private java.lang.String description;
        private java.util.List<atc.chassis.exception.ErrorMessage> details;
        private java.lang.String supportReferenceId;
        public static final atc.chassis.exception.ApiError.Builder.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError.Builder withHttpStatusCode(@org.jetbrains.annotations.Nullable()
        java.lang.Integer httpStatusCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError.Builder withHttpMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String httpMessage) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError.Builder withDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError.Builder withDetails(@org.jetbrains.annotations.NotNull()
        java.util.List<atc.chassis.exception.ErrorMessage> details) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError.Builder withSupportReferenceId(@org.jetbrains.annotations.NotNull()
        java.lang.String supportReferenceId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final atc.chassis.exception.ApiError build() {
            return null;
        }
        
        private Builder() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Latc/chassis/exception/ApiError$Builder$Companion;", "", "()V", "apiError", "Latc/chassis/exception/ApiError$Builder;", "microservice-chassis-kotlin"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final atc.chassis.exception.ApiError.Builder apiError() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}