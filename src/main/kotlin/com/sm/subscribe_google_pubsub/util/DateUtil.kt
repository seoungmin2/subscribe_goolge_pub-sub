package com.sm.subscribe_google_pubsub.util

import java.text.SimpleDateFormat
import java.util.*

class DateUtil {

    fun millisecondsToDate(milliseconds: Long): Date {

        var date = Date()

        val dateFormat = SimpleDateFormat("yyyy/MM/dd hh:mm:ss")

        return dateFormat.parse(dateFormat.format(milliseconds))

    }

}