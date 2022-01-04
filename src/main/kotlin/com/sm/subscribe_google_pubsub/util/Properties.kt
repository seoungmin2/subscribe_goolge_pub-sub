package com.sm.subscribe_google_pubsub.util

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "application.app")
data class Properties(

    val packageName: String,

)
