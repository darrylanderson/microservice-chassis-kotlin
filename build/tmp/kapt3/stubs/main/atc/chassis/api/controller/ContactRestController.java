package atc.chassis.api.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0003H\'J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Latc/chassis/api/controller/ContactRestController;", "", "createContact", "Lorg/springframework/http/ResponseEntity;", "Latc/chassis/api/model/Contact;", "contact", "listContacts", "", "searchContacts", "Latc/chassis/api/model/Contacts;", "authentication", "Lorg/springframework/security/core/Authentication;", "query", "", "microservice-chassis-kotlin"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/contacts"})
@org.springframework.web.bind.annotation.RestController()
public abstract interface ContactRestController {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.security.access.prepost.PreAuthorize(value = "#oauth2.hasScope(\'read:contacts\')")
    @org.springframework.web.bind.annotation.RequestMapping(produces = {"application/json"}, consumes = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET}, value = {"/contacts"})
    @io.swagger.annotations.ApiResponses(value = {@io.swagger.annotations.ApiResponse(code = 200, response = atc.chassis.api.model.Contacts.class, message = "A list of contacts")})
    @io.swagger.annotations.ApiOperation(value = "List contacts", nickname = "listContacts", notes = "Returns a list of all contacts.", response = atc.chassis.api.model.Contacts.class, authorizations = {@io.swagger.annotations.Authorization(value = "OAuth2", scopes = {@io.swagger.annotations.AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts")}), @io.swagger.annotations.Authorization(value = "ApiKey")}, tags = {"Contact Service"})
    public abstract org.springframework.http.ResponseEntity<java.util.List<atc.chassis.api.model.Contact>> listContacts();
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestMapping(produces = {"application/json"}, consumes = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET}, value = {"/contacts/search"})
    @io.swagger.annotations.ApiResponses(value = {@io.swagger.annotations.ApiResponse(code = 200, response = atc.chassis.api.model.Contacts.class, message = "A list of contacts")})
    @io.swagger.annotations.ApiOperation(value = "Search for contacts", nickname = "searchContacts", notes = "Search for contacts matching a given set of criteria. This uses a simple query language. \n\nTo search for a contact by email: /contacts/search?query=email:john.doe@company.com. \n\nTo search by contact name: /contacts/search?query=name:johndoe. \n\nTo search by phone number: /contacts/search?query=phone:555-555-5555.", response = atc.chassis.api.model.Contacts.class, authorizations = {@io.swagger.annotations.Authorization(value = "OAuth2", scopes = {@io.swagger.annotations.AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts")}), @io.swagger.annotations.Authorization(value = "ApiKey")}, tags = {"Contact Service"})
    public abstract org.springframework.http.ResponseEntity<atc.chassis.api.model.Contacts> searchContacts(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam(value = "query")
    @io.swagger.annotations.ApiParam(value = "Search query string")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.security.access.prepost.PreAuthorize(value = "#oauth2.hasScope(\'write_contacts\')")
    @org.springframework.web.bind.annotation.RequestMapping(produces = {"application/json"}, consumes = {"application/json"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST}, value = {"/"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    @io.swagger.annotations.ApiResponses(value = {@io.swagger.annotations.ApiResponse(code = 201, response = atc.chassis.api.model.Contact.class, message = "Contact created successfully")})
    @io.swagger.annotations.ApiOperation(value = "Create contact", nickname = "createContact", notes = "Create a new contact", response = atc.chassis.api.model.Contact.class, authorizations = {@io.swagger.annotations.Authorization(value = "OAuth2", scopes = {@io.swagger.annotations.AuthorizationScope(scope = "write:contacts", description = "Ability to create contacts"), @io.swagger.annotations.AuthorizationScope(scope = "read:contacts", description = "Ability to read contacts")}), @io.swagger.annotations.Authorization(value = "ApiKey")}, tags = {"Contact Service"})
    public abstract org.springframework.http.ResponseEntity<atc.chassis.api.model.Contact> createContact(@org.jetbrains.annotations.NotNull()
    atc.chassis.api.model.Contact contact);
}