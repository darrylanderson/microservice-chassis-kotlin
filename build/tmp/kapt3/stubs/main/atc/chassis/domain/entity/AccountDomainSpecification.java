package atc.chassis.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Latc/chassis/domain/entity/AccountDomainSpecification;", "Lorg/springframework/data/jpa/domain/Specification;", "Latc/chassis/domain/entity/ContactEntity;", "criteria", "Latc/chassis/domain/entity/SearchCriteria;", "(Latc/chassis/domain/entity/SearchCriteria;)V", "toPredicate", "Ljavax/persistence/criteria/Predicate;", "root", "Ljavax/persistence/criteria/Root;", "query", "Ljavax/persistence/criteria/CriteriaQuery;", "builder", "Ljavax/persistence/criteria/CriteriaBuilder;", "microservice-chassis-kotlin"})
public final class AccountDomainSpecification implements org.springframework.data.jpa.domain.Specification<atc.chassis.domain.entity.ContactEntity> {
    private final atc.chassis.domain.entity.SearchCriteria criteria = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public javax.persistence.criteria.Predicate toPredicate(@org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.Root<atc.chassis.domain.entity.ContactEntity> root, @org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.CriteriaQuery<?> query, @org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.CriteriaBuilder builder) {
        return null;
    }
    
    public AccountDomainSpecification(@org.jetbrains.annotations.NotNull()
    atc.chassis.domain.entity.SearchCriteria criteria) {
        super();
    }
}