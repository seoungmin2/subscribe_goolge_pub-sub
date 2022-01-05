package com.sm.subscribe_google_pubsub.domain.entity

import com.querydsl.core.annotations.PropertyType
import com.querydsl.core.annotations.QueryType
import lombok.Data
import javax.persistence.*

@Entity
@Table(name = "PAYLOAD")
@Data
class SubscribeLogEntity(payload: String, state: StateEnum) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var payload: String? = payload
    @Enumerated(EnumType.ORDINAL)
    @QueryType(PropertyType.ENUM)
    var state: StateEnum? = state

}