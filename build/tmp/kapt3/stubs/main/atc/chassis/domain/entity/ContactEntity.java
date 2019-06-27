package atc.chassis.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001e\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015\u00a8\u0006%"}, d2 = {"Latc/chassis/domain/entity/ContactEntity;", "", "id", "", "name", "", "email", "phone", "createdOn", "Ljava/time/OffsetDateTime;", "updatedOn", "createdBy", "updatedBy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "setCreatedBy", "(Ljava/lang/String;)V", "getCreatedOn", "()Ljava/time/OffsetDateTime;", "setCreatedOn", "(Ljava/time/OffsetDateTime;)V", "getEmail", "setEmail", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "setName", "getPhone", "setPhone", "getUpdatedBy", "setUpdatedBy", "getUpdatedOn", "setUpdatedOn", "microservice-chassis-kotlin"})
@javax.persistence.Table(name = "contact")
@javax.persistence.Entity()
public class ContactEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.SequenceGenerator(name = "account_id_gen", sequenceName = "account_seq", allocationSize = 1)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "account_id_gen")
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.annotation.CreatedDate()
    @javax.persistence.Column(nullable = false, updatable = false)
    private java.time.OffsetDateTime createdOn;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.annotation.LastModifiedDate()
    @javax.persistence.Column(nullable = false)
    private java.time.OffsetDateTime updatedOn;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.data.annotation.CreatedBy()
    @javax.persistence.Column(nullable = true, updatable = false)
    private java.lang.String createdBy;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.data.annotation.LastModifiedBy()
    @javax.persistence.Column(nullable = true)
    private java.lang.String updatedBy;
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPhone() {
        return null;
    }
    
    public void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.time.OffsetDateTime getCreatedOn() {
        return null;
    }
    
    public void setCreatedOn(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.time.OffsetDateTime getUpdatedOn() {
        return null;
    }
    
    public void setUpdatedOn(@org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getCreatedBy() {
        return null;
    }
    
    public void setCreatedBy(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUpdatedBy() {
        return null;
    }
    
    public void setUpdatedBy(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ContactEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime createdOn, @org.jetbrains.annotations.NotNull()
    java.time.OffsetDateTime updatedOn, @org.jetbrains.annotations.Nullable()
    java.lang.String createdBy, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedBy) {
        super();
    }
    
    public ContactEntity() {
        super();
    }
}