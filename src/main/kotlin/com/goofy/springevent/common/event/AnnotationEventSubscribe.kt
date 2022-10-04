package com.goofy.springevent.common.event

import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class AnnotationEventSubscribe {
    private val logger = KotlinLogging.logger {}

    @EventListener
    fun subscribe(event: EventModel) {
        logger.info { "subscribe event ${event.any}" }
    }
}
