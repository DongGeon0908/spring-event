package com.goofy.springevent.common.event

import mu.KotlinLogging
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class EventSubscribe : ApplicationListener<EventModel> {
    private val logger = KotlinLogging.logger {}

    override fun onApplicationEvent(event: EventModel) {
        logger.info { "subscribe event ${event.any}" }
    }
}
