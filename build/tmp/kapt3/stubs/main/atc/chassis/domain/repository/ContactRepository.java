package atc.chassis.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Latc/chassis/domain/repository/ContactRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Latc/chassis/domain/entity/ContactEntity;", "", "Lorg/springframework/data/jpa/repository/JpaSpecificationExecutor;", "findByEmail", "", "userName", "", "findByPhone", "phone", "microservice-chassis-kotlin"})
public abstract interface ContactRepository extends org.springframework.data.repository.CrudRepository<atc.chassis.domain.entity.ContactEntity, java.lang.Long>, org.springframework.data.jpa.repository.JpaSpecificationExecutor<atc.chassis.domain.entity.ContactEntity> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Iterable<atc.chassis.domain.entity.ContactEntity> findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Iterable<atc.chassis.domain.entity.ContactEntity> findByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String phone);
}