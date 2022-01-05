package com.sm.subscribe_google_pubsub.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/sm/subscribe_google_pubsub/controller/AosSubscribeController;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "subscribeService", "Lcom/sm/subscribe_google_pubsub/service/AosSubscribeService;", "messageReceiver", "", "payload", "", "subscribe_google_pub-sub"})
@org.springframework.web.bind.annotation.RestController()
public class AosSubscribeController {
    private final org.slf4j.Logger logger = null;
    @org.springframework.beans.factory.annotation.Autowired()
    private com.sm.subscribe_google_pubsub.service.AosSubscribeService subscribeService;
    
    public AosSubscribeController() {
        super();
    }
    
    @org.springframework.integration.annotation.ServiceActivator(inputChannel = "inputChannel")
    public void messageReceiver(@org.jetbrains.annotations.NotNull()
    java.lang.String payload) {
    }
}