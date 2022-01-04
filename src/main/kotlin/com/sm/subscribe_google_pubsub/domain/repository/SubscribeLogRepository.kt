package com.sm.subscribe_google_pubsub.domain.repository

import com.sm.subscribe_google_pubsub.domain.entity.SubscribeLogEntity
import org.springframework.data.repository.CrudRepository

interface SubscribeLogRepository: CrudRepository<SubscribeLogEntity, Long> {



}