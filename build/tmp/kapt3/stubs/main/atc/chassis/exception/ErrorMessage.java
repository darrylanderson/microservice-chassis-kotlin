package atc.chassis.exception;

import java.lang.System;

/**
 * Simple representation of an api message.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0004H\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u000f"}, d2 = {"Latc/chassis/exception/ErrorMessage;", "Ljava/io/Serializable;", "()V", "message", "", "diagnostic", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiagnostic", "()Ljava/lang/String;", "setDiagnostic", "(Ljava/lang/String;)V", "getMessage", "setMessage", "toString", "Companion", "microservice-chassis-kotlin"})
@io.swagger.annotations.ApiModel(description = "Simple representation of an error message.")
public final class ErrorMessage implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "Message informational text.", position = 10)
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.annotations.ApiModelProperty(value = "Optional diagnostic information.", position = 20)
    private java.lang.String diagnostic;
    private static final long serialVersionUID = -8470489093537747778L;
    public static final atc.chassis.exception.ErrorMessage.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiagnostic() {
        return null;
    }
    
    public final void setDiagnostic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ErrorMessage() {
        super();
    }
    
    public ErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String diagnostic) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Latc/chassis/exception/ErrorMessage$Companion;", "", "()V", "serialVersionUID", "", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}