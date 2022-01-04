package com.sm.subscribe_google_pubsub.util

import com.google.cloud.spring.pubsub.core.PubSubTemplate
import com.google.cloud.spring.pubsub.integration.inbound.PubSubInboundChannelAdapter
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.integration.channel.DirectChannel
import org.springframework.messaging.MessageChannel
import org.springframework.stereotype.Component

@Component
class PubSubChannel {
    @Bean
    fun messageChannelAdapter(
        @Qualifier("inputChannel") inputChannel: MessageChannel, pubSubTemplate: PubSubTemplate,
    ): PubSubInboundChannelAdapter {
        val adapter = PubSubInboundChannelAdapter(pubSubTemplate, "MySub")
        adapter.outputChannel = inputChannel
        return adapter
    }

    @Bean
    fun inputChannel(): MessageChannel? {
        return DirectChannel()
    }
}