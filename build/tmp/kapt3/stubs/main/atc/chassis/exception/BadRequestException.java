package atc.chassis.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Latc/chassis/exception/BadRequestException;", "Latc/chassis/exception/AbstractApiException;", "message", "", "(Ljava/lang/String;)V", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "details", "", "Latc/chassis/exception/ErrorMessage;", "(Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Throwable;)V", "microservice-chassis-kotlin"})
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
public final class BadRequestException extends atc.chassis.exception.AbstractApiException {
    
    public BadRequestException(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super(null);
    }
    
    public BadRequestException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        super(null);
    }
    
    public BadRequestException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<atc.chassis.exception.ErrorMessage> details) {
        super(null);
    }
    
    public BadRequestException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.List<atc.chassis.exception.ErrorMessage> details, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        super(null);
    }
}