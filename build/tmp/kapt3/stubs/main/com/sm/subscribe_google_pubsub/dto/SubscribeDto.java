package com.sm.subscribe_google_pubsub.dto;

import java.lang.System;

@lombok.Data()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/sm/subscribe_google_pubsub/dto/SubscribeDto;", "", "()V", "eventTimeMillis", "", "getEventTimeMillis", "()Ljava/lang/Long;", "setEventTimeMillis", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "packageName", "", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "subscriptionNotification", "Lcom/sm/subscribe_google_pubsub/dto/NotificationDto;", "getSubscriptionNotification", "()Lcom/sm/subscribe_google_pubsub/dto/NotificationDto;", "setSubscriptionNotification", "(Lcom/sm/subscribe_google_pubsub/dto/NotificationDto;)V", "testNotification", "Lcom/sm/subscribe_google_pubsub/dto/TestNotificationDto;", "getTestNotification", "()Lcom/sm/subscribe_google_pubsub/dto/TestNotificationDto;", "setTestNotification", "(Lcom/sm/subscribe_google_pubsub/dto/TestNotificationDto;)V", "version", "getVersion", "setVersion", "subscribe_google_pub-sub"})
public final class SubscribeDto {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String version;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packageName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long eventTimeMillis;
    public com.sm.subscribe_google_pubsub.dto.NotificationDto subscriptionNotification;
    @org.jetbrains.annotations.Nullable()
    private com.sm.subscribe_google_pubsub.dto.TestNotificationDto testNotification;
    
    public SubscribeDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    public final void setPackageName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEventTimeMillis() {
        return null;
    }
    
    public final void setEventTimeMillis(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sm.subscribe_google_pubsub.dto.NotificationDto getSubscriptionNotification() {
        return null;
    }
    
    public final void setSubscriptionNotification(@org.jetbrains.annotations.NotNull()
    com.sm.subscribe_google_pubsub.dto.NotificationDto p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sm.subscribe_google_pubsub.dto.TestNotificationDto getTestNotification() {
        return null;
    }
    
    public final void setTestNotification(@org.jetbrains.annotations.Nullable()
    com.sm.subscribe_google_pubsub.dto.TestNotificationDto p0) {
    }
}