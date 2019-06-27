package atc.chassis.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\rR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Latc/chassis/exception/AbstractApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "details", "", "Latc/chassis/exception/ErrorMessage;", "(Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Throwable;)V", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "microservice-chassis-kotlin"})
public class AbstractApiException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<atc.chassis.exception.ErrorMessage> details;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<atc.chassis.exception.ErrorMessage> getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<atc.chassis.exception.ErrorMessage> p0) {
    }
    
    public AbstractApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super();
    }
    
    public AbstractApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        super();
    }
    
    public AbstractApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<atc.chassis.exception.ErrorMessage> details) {
        super();
    }
    
    public AbstractApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<atc.chassis.exception.ErrorMessage> details, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        super();
    }
}