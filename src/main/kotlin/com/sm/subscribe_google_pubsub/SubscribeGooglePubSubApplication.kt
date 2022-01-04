package com.sm.subscribe_google_pubsub

import com.sm.subscribe_google_pubsub.util.Properties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Properties::class)
class SubscribeGooglePubSubApplication

fun main(args: Array<String>) {
    runApplication<SubscribeGooglePubSubApplication>(*args)
}
