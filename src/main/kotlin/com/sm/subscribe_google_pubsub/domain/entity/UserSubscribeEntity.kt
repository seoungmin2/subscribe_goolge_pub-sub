package com.sm.subscribe_google_pubsub.domain.entity

import lombok.Data
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "SUBSCRIBE_LOG")
@Data
class UserSubscribeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var purchaseToken: String ? = null
    var orderId: String ? = null
    var linkedPurchaseToken: String ? = null
    var startDate: Date? = null
    var endDate: Date? = null


}