package atc.chassis.domain.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Latc/chassis/domain/service/ContactService;", "", "contactRepository", "Latc/chassis/domain/repository/ContactRepository;", "(Latc/chassis/domain/repository/ContactRepository;)V", "getContactRepository", "()Latc/chassis/domain/repository/ContactRepository;", "createContact", "Latc/chassis/domain/entity/ContactEntity;", "contactEntity", "listContacts", "", "queryContacts", "spec", "Lorg/springframework/data/jpa/domain/Specification;", "microservice-chassis-kotlin"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class ContactService {
    @org.jetbrains.annotations.NotNull()
    private final atc.chassis.domain.repository.ContactRepository contactRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.domain.entity.ContactEntity createContact(@org.jetbrains.annotations.NotNull()
    atc.chassis.domain.entity.ContactEntity contactEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Iterable<atc.chassis.domain.entity.ContactEntity> listContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Iterable<atc.chassis.domain.entity.ContactEntity> queryContacts(@org.jetbrains.annotations.Nullable()
    org.springframework.data.jpa.domain.Specification<atc.chassis.domain.entity.ContactEntity> spec) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public atc.chassis.domain.repository.ContactRepository getContactRepository() {
        return null;
    }
    
    public ContactService(@org.jetbrains.annotations.NotNull()
    atc.chassis.domain.repository.ContactRepository contactRepository) {
        super();
    }
}