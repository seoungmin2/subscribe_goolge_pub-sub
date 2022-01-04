package com.sm.subscribe_google_pubsub.domain.entity

import com.sm.subscribe_google_pubsub.enum.StateEnum
import lombok.Data
import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

@Entity
@Table(name = "SUBSCRIBE_LOG")
@Data
class SubscribeLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var payload: String? = null
    var state: StateEnum? = null

    constructor(payload: String, state: StateEnum) {
        this.payload = payload
        this.state = state
    }

}