package com.sm.subscribe_google_pubsub.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020#H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u00158\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00178\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/sm/subscribe_google_pubsub/service/AosSubscribeService;", "", "()V", "em", "Ljavax/persistence/EntityManager;", "getEm", "()Ljavax/persistence/EntityManager;", "setEm", "(Ljavax/persistence/EntityManager;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "properties", "Lcom/sm/subscribe_google_pubsub/util/Properties;", "getProperties", "()Lcom/sm/subscribe_google_pubsub/util/Properties;", "setProperties", "(Lcom/sm/subscribe_google_pubsub/util/Properties;)V", "subscribeLogRepository", "Lcom/sm/subscribe_google_pubsub/domain/repository/SubscribeLogRepository;", "userSubscribeRepository", "Lcom/sm/subscribe_google_pubsub/domain/repository/UserSubscribeRepository;", "getGoogleSubscribe", "", "subscribeDto", "Lcom/sm/subscribe_google_pubsub/dto/SubscribeDto;", "purchaseToEntity", "Lcom/sm/subscribe_google_pubsub/domain/entity/UserSubscribeEntity;", "productPurchase", "Lcom/google/api/services/androidpublisher/model/SubscriptionPurchase;", "notificationDto", "Lcom/sm/subscribe_google_pubsub/dto/NotificationDto;", "saveSubscribeLog", "", "payload", "", "(Ljava/lang/String;)Ljava/lang/Long;", "updateStatePayload", "subscriptionId", "subscribe_google_pub-sub"})
@org.springframework.stereotype.Service()
public class AosSubscribeService {
    private final org.slf4j.Logger log = null;
    @javax.persistence.PersistenceContext()
    public javax.persistence.EntityManager em;
    @org.springframework.beans.factory.annotation.Autowired()
    public com.sm.subscribe_google_pubsub.util.Properties properties;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.sm.subscribe_google_pubsub.domain.repository.SubscribeLogRepository subscribeLogRepository;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.sm.subscribe_google_pubsub.domain.repository.UserSubscribeRepository userSubscribeRepository;
    
    public AosSubscribeService() {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public javax.persistence.EntityManager getEm() {
        return null;
    }
    
    public void setEm(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.sm.subscribe_google_pubsub.util.Properties getProperties() {
        return null;
    }
    
    public void setProperties(@org.jetbrains.annotations.NotNull()
    com.sm.subscribe_google_pubsub.util.Properties p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long saveSubscribeLog(@org.jetbrains.annotations.NotNull()
    java.lang.String payload) {
        return null;
    }
    
    public void getGoogleSubscribe(@org.jetbrains.annotations.NotNull()
    com.sm.subscribe_google_pubsub.dto.SubscribeDto subscribeDto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.sm.subscribe_google_pubsub.domain.entity.UserSubscribeEntity purchaseToEntity(@org.jetbrains.annotations.NotNull()
    com.google.api.services.androidpublisher.model.SubscriptionPurchase productPurchase, @org.jetbrains.annotations.NotNull()
    com.sm.subscribe_google_pubsub.dto.NotificationDto notificationDto) {
        return null;
    }
    
    public void updateStatePayload(long subscriptionId) {
    }
}