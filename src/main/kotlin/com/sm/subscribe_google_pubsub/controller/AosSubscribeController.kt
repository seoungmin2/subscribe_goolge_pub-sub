package com.sm.subscribe_google_pubsub.controller

import com.sm.subscribe_google_pubsub.dto.SubscribeDto
import com.sm.subscribe_google_pubsub.service.AosSubscribeService
import org.modelmapper.ModelMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AosSubscribeController {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    private lateinit var subscribeService: AosSubscribeService

    @ServiceActivator(inputChannel = "inputChannel")
    fun messageReceiver(payload: String) {
        logger.info(payload)

        val modelMapper = ModelMapper()

        val subscribe = modelMapper.map(payload, SubscribeDto::class.java)

        val subscribeId = subscribeService.saveSubscribeLog(payload)

        subscribeService.getGoogleSubscribe(subscribe)

        subscribeService.updateStatePayload(subscribeId!!)

    }
}