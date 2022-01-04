package com.sm.subscribe_google_pubsub.domain.entity

import com.sm.subscribe_google_pubsub.enum.StateEnum
import lombok.Data
import org.hibernate.annotations.ColumnDefault
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
    var startDate: Date? = null
    var endDate: Date? = null


}