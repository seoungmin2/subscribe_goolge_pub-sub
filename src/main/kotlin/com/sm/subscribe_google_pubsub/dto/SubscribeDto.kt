package com.sm.subscribe_google_pubsub.dto

import com.sm.subscribe_google_pubsub.enum.NotificationEnum
import lombok.Data

@Data
class SubscribeDto {

    var version: String? = null
    var packageName: String? = null
    var eventTimeMillis: Long? = null
    lateinit var subscriptionNotification: NotificationDto
    var testNotification: TestNotificationDto? = null

}

@Data
class NotificationDto {

    var notificationType: NotificationEnum? = null
    var purchaseToken: String? = null
    var subscriptionId: String? = null
    var eventTime: Long? = null

}

@Data
class TestNotificationDto {
    var version: String? = null
}