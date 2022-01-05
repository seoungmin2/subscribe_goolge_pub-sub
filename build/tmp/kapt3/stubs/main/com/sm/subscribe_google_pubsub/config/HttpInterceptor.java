package com.sm.subscribe_google_pubsub.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J*\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/sm/subscribe_google_pubsub/config/HttpInterceptor;", "Lorg/springframework/web/servlet/HandlerInterceptor;", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLog", "()Lorg/slf4j/Logger;", "afterCompletion", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "handler", "", "ex", "Ljava/lang/Exception;", "postHandle", "modelAndView", "Lorg/springframework/web/servlet/ModelAndView;", "preHandle", "", "subscribe_google_pub-sub"})
@org.springframework.stereotype.Component()
public class HttpInterceptor implements org.springframework.web.servlet.HandlerInterceptor {
    private final org.slf4j.Logger log = null;
    
    public HttpInterceptor() {
        super();
    }
    
    public org.slf4j.Logger getLog() {
        return null;
    }
    
    @java.lang.Override()
    public boolean preHandle(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.Object handler) {
        return false;
    }
    
    @java.lang.Override()
    public void postHandle(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.Object handler, @org.jetbrains.annotations.Nullable()
    org.springframework.web.servlet.ModelAndView modelAndView) {
    }
    
    @java.lang.Override()
    public void afterCompletion(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.Object handler, @org.jetbrains.annotations.Nullable()
    java.lang.Exception ex) {
    }
}