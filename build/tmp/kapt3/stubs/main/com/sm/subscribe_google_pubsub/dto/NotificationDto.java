package com.sm.subscribe_google_pubsub.dto;

import java.lang.System;

@lombok.Data()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/sm/subscribe_google_pubsub/dto/NotificationDto;", "", "()V", "eventTime", "", "getEventTime", "()Ljava/lang/Long;", "setEventTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "notificationType", "Lcom/sm/subscribe_google_pubsub/enum/NotificationEnum;", "getNotificationType", "()Lcom/sm/subscribe_google_pubsub/enum/NotificationEnum;", "setNotificationType", "(Lcom/sm/subscribe_google_pubsub/enum/NotificationEnum;)V", "purchaseToken", "", "getPurchaseToken", "()Ljava/lang/String;", "setPurchaseToken", "(Ljava/lang/String;)V", "subscriptionId", "getSubscriptionId", "setSubscriptionId", "subscribe_google_pub-sub"})
public final class NotificationDto {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String purchaseToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subscriptionId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long eventTime;
    
    public NotificationDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPurchaseToken() {
        return null;
    }
    
    public final void setPurchaseToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriptionId() {
        return null;
    }
    
    public final void setSubscriptionId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEventTime() {
        return null;
    }
    
    public final void setEventTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}