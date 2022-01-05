package com.sm.subscribe_google_pubsub.domain.repository

import com.sm.subscribe_google_pubsub.domain.entity.UserSubscribeEntity
import org.springframework.data.repository.CrudRepository

interface UserSubscribeRepository: CrudRepository<UserSubscribeEntity, Long> {



}