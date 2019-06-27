package atc.chassis.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J<\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\u0010\u0006\u001a\u00060\nj\u0002`\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\nj\u0002`\u000bH\u0017\u00a8\u0006\u0015"}, d2 = {"Latc/chassis/api/controller/ControllerExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "handleBadRequestException", "Lorg/springframework/http/ResponseEntity;", "Latc/chassis/exception/ApiError;", "e", "Latc/chassis/exception/BadRequestException;", "handleExceptionInternal", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "body", "headers", "Lorg/springframework/http/HttpHeaders;", "status", "Lorg/springframework/http/HttpStatus;", "request", "Lorg/springframework/web/context/request/WebRequest;", "handleInternalError", "Companion", "microservice-chassis-kotlin"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class ControllerExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    private static final org.slf4j.Logger log = null;
    public static final atc.chassis.api.controller.ControllerExceptionHandler.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {atc.chassis.exception.BadRequestException.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
    public org.springframework.http.ResponseEntity<atc.chassis.exception.ApiError> handleBadRequestException(@org.jetbrains.annotations.NotNull()
    atc.chassis.exception.BadRequestException e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.Exception.class})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public org.springframework.http.ResponseEntity<atc.chassis.exception.ApiError> handleInternalError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    /**
     * Override handling of all internal Spring exceptions to return JSON.
     *
     * @param ex      the original exception
     * @param body    pretty much always null from Spring
     * @param headers the original headers
     * @param status  the http status code
     * @param request the original request
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.springframework.http.ResponseEntity<java.lang.Object> handleExceptionInternal(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e, @org.jetbrains.annotations.Nullable()
    java.lang.Object body, @org.jetbrains.annotations.NotNull()
    org.springframework.http.HttpHeaders headers, @org.jetbrains.annotations.NotNull()
    org.springframework.http.HttpStatus status, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
    
    public ControllerExceptionHandler() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Latc/chassis/api/controller/ControllerExceptionHandler$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}