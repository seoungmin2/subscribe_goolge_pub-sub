package com.sm.subscribe_google_pubsub.service

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.services.androidpublisher.AndroidPublisher
import com.google.api.services.androidpublisher.AndroidPublisherScopes
import com.google.auth.http.HttpCredentialsAdapter
import com.google.api.client.json.jackson2.JacksonFactory.*
import com.google.auth.oauth2.GoogleCredentials
import com.sm.subscribe_google_pubsub.domain.entity.SubscribeLogEntity
import com.sm.subscribe_google_pubsub.domain.repository.SubscribeLogRepository
import com.sm.subscribe_google_pubsub.dto.NotificationDto
import com.sm.subscribe_google_pubsub.dto.SubscribeDto
import com.sm.subscribe_google_pubsub.enum.StateEnum
import com.sm.subscribe_google_pubsub.util.DateUtil
import com.sm.subscribe_google_pubsub.util.FileUtil
import com.sm.subscribe_google_pubsub.util.Properties
import org.modelmapper.ModelMapper
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.FileInputStream
import java.text.SimpleDateFormat

@Service
class AosSubscribeService {

    val log = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var properties: Properties

    @Autowired
    private lateinit var subscribeLogRepository: SubscribeLogRepository

    fun saveSubscribeLog(payload: String) {
        subscribeLogRepository.save(SubscribeLogEntity(payload = payload, state = StateEnum.WAIT))
    }

    fun getGoogleSubscribe(notificationDto: NotificationDto) {

        val file = FileUtil().makeFile("/serviceAccount.json")

        val credentials: GoogleCredentials = GoogleCredentials.fromStream(FileInputStream(file)).createScoped(
            AndroidPublisherScopes.ANDROIDPUBLISHER)

        val jsonFactory = getDefaultInstance()

        val httpTransport = GoogleNetHttpTransport.newTrustedTransport()

        val httpCredentialsAdapter = HttpCredentialsAdapter(credentials)

        val publisher = AndroidPublisher.Builder(httpTransport, jsonFactory, httpCredentialsAdapter).setApplicationName(properties.packageName).build()

        val get = publisher.purchases().subscriptions().get(properties.packageName, notificationDto.subscriptionId, notificationDto.purchaseToken)
        var productPurchase = get.execute()

    }


}