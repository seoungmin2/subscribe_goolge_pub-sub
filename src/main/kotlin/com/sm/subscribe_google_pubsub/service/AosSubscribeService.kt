package com.sm.subscribe_google_pubsub.service

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.services.androidpublisher.AndroidPublisher
import com.google.api.services.androidpublisher.AndroidPublisherScopes
import com.google.auth.http.HttpCredentialsAdapter
import com.google.api.client.json.jackson2.JacksonFactory.*
import com.google.api.services.androidpublisher.model.SubscriptionPurchase
import com.google.api.services.androidpublisher.model.SubscriptionPurchasesAcknowledgeRequest
import com.google.auth.oauth2.GoogleCredentials
import com.querydsl.jpa.impl.JPAQueryFactory
import com.sm.subscribe_google_pubsub.domain.entity.*
import com.sm.subscribe_google_pubsub.domain.repository.SubscribeLogRepository
import com.sm.subscribe_google_pubsub.domain.repository.UserSubscribeRepository
import com.sm.subscribe_google_pubsub.dto.NotificationDto
import com.sm.subscribe_google_pubsub.dto.SubscribeDto
import com.sm.subscribe_google_pubsub.util.DateUtil
import com.sm.subscribe_google_pubsub.util.FileUtil
import com.sm.subscribe_google_pubsub.util.Properties
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.FileInputStream
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Service
class AosSubscribeService {

    val log = LoggerFactory.getLogger(this::class.java)

    @PersistenceContext
    lateinit var em: EntityManager

    @Autowired
    lateinit var properties: Properties

    @Autowired
    private lateinit var subscribeLogRepository: SubscribeLogRepository

    @Autowired
    private lateinit var userSubscribeRepository: UserSubscribeRepository

    fun saveSubscribeLog(payload: String): Long? {
        return subscribeLogRepository.save(SubscribeLogEntity(payload = payload, state = StateEnum.WAIT)).id
    }

    fun getGoogleSubscribe(subscribeDto: SubscribeDto) {

        val notificationDto = subscribeDto.subscriptionNotification

        val file = FileUtil().makeFile("/serviceAccount.json")

        val credentials: GoogleCredentials = GoogleCredentials.fromStream(FileInputStream(file!!)).createScoped(
            AndroidPublisherScopes.ANDROIDPUBLISHER)

        val jsonFactory = getDefaultInstance()

        val httpTransport = GoogleNetHttpTransport.newTrustedTransport()

        val httpCredentialsAdapter = HttpCredentialsAdapter(credentials)

        val publisher = AndroidPublisher.Builder(httpTransport, jsonFactory, httpCredentialsAdapter).setApplicationName(properties.packageName).build()

        val get = publisher.purchases().subscriptions().get(properties.packageName, notificationDto.subscriptionId, notificationDto.purchaseToken)
        val productPurchase = get.execute()

        if (productPurchase.acknowledgementState == 0) {
            val subscriptionAcknowledge = SubscriptionPurchasesAcknowledgeRequest()

            subscriptionAcknowledge.developerPayload = productPurchase.developerPayload

            publisher.purchases().subscriptions().acknowledge(properties.packageName
                , notificationDto.subscriptionId
                , notificationDto.purchaseToken
                , subscriptionAcknowledge).execute()
        }

        val subscribeEntity = purchaseToEntity(productPurchase, notificationDto)

        userSubscribeRepository.save(subscribeEntity)

    }

    fun purchaseToEntity(productPurchase: SubscriptionPurchase, notificationDto: NotificationDto): UserSubscribeEntity {

        val userSubscribeEntity = UserSubscribeEntity()

        userSubscribeEntity.startDate = DateUtil().millisecondsToDate(productPurchase.startTimeMillis)
        userSubscribeEntity.endDate = DateUtil().millisecondsToDate(productPurchase.expiryTimeMillis)
        userSubscribeEntity.orderId = productPurchase.orderId
        userSubscribeEntity.linkedPurchaseToken = productPurchase.linkedPurchaseToken
        userSubscribeEntity.purchaseToken = notificationDto.purchaseToken

        return userSubscribeEntity
    }

    fun updateStatePayload(subscriptionId: Long) {

        val queryFactory = JPAQueryFactory(em)
        val subscribeLog = QSubscribeLogEntity.subscribeLogEntity

        queryFactory.update(subscribeLog).where(subscribeLog.id.eq(subscriptionId)).set(subscribeLog.state, StateEnum.SUCCESS).execute()

    }
}