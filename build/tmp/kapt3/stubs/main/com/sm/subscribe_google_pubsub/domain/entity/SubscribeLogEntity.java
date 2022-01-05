package com.sm.subscribe_google_pubsub.domain.entity;

import java.lang.System;

@lombok.Data()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/sm/subscribe_google_pubsub/domain/entity/SubscribeLogEntity;", "", "payload", "", "state", "Lcom/sm/subscribe_google_pubsub/domain/entity/StateEnum;", "(Ljava/lang/String;Lcom/sm/subscribe_google_pubsub/domain/entity/StateEnum;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPayload", "()Ljava/lang/String;", "setPayload", "(Ljava/lang/String;)V", "getState", "()Lcom/sm/subscribe_google_pubsub/domain/entity/StateEnum;", "setState", "(Lcom/sm/subscribe_google_pubsub/domain/entity/StateEnum;)V", "subscribe_google_pub-sub"})
@javax.persistence.Table(name = "PAYLOAD")
@javax.persistence.Entity()
public final class SubscribeLogEntity {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String payload;
    @org.jetbrains.annotations.Nullable()
    @com.querydsl.core.annotations.QueryType(value = com.querydsl.core.annotations.PropertyType.ENUM)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.ORDINAL)
    private com.sm.subscribe_google_pubsub.domain.entity.StateEnum state;
    
    public SubscribeLogEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String payload, @org.jetbrains.annotations.NotNull()
    com.sm.subscribe_google_pubsub.domain.entity.StateEnum state) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPayload() {
        return null;
    }
    
    public final void setPayload(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sm.subscribe_google_pubsub.domain.entity.StateEnum getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable()
    com.sm.subscribe_google_pubsub.domain.entity.StateEnum p0) {
    }
}