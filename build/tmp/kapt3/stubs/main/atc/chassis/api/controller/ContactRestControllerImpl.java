package atc.chassis.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\bH\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Latc/chassis/api/controller/ContactRestControllerImpl;", "Latc/chassis/api/controller/ContactRestController;", "contactService", "Latc/chassis/domain/service/ContactService;", "(Latc/chassis/domain/service/ContactService;)V", "getContactService", "()Latc/chassis/domain/service/ContactService;", "createContact", "Lorg/springframework/http/ResponseEntity;", "Latc/chassis/api/model/Contact;", "contact", "listContacts", "", "searchContacts", "Latc/chassis/api/model/Contacts;", "authentication", "Lorg/springframework/security/core/Authentication;", "query", "", "transformEntityToModel", "entity", "Latc/chassis/domain/entity/ContactEntity;", "transformModelToEntity", "model", "Companion", "microservice-chassis-kotlin"})
public class ContactRestControllerImpl implements atc.chassis.api.controller.ContactRestController {
    @org.jetbrains.annotations.NotNull()
    private final atc.chassis.domain.service.ContactService contactService = null;
    private static final org.slf4j.Logger log = null;
    public static final atc.chassis.api.controller.ContactRestControllerImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<java.util.List<atc.chassis.api.model.Contact>> listContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<atc.chassis.api.model.Contacts> searchContacts(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "query")
    @io.swagger.annotations.ApiParam(value = "Search query string")
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.ResponseEntity<atc.chassis.api.model.Contact> createContact(@org.jetbrains.annotations.NotNull()
    atc.chassis.api.model.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.api.model.Contact transformEntityToModel(@org.jetbrains.annotations.NotNull()
    atc.chassis.domain.entity.ContactEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.domain.entity.ContactEntity transformModelToEntity(@org.jetbrains.annotations.NotNull()
    atc.chassis.api.model.Contact model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.domain.service.ContactService getContactService() {
        return null;
    }
    
    public ContactRestControllerImpl(@org.jetbrains.annotations.NotNull()
    atc.chassis.domain.service.ContactService contactService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Latc/chassis/api/controller/ContactRestControllerImpl$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "microservice-chassis-kotlin"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}