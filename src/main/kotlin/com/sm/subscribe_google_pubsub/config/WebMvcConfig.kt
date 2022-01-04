package com.sm.subscribe_google_pubsub.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfig: WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        
        registry.addInterceptor(HttpInterceptor())

        super.addInterceptors(registry)
    }

}