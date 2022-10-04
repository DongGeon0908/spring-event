package com.goofy.springevent.common.event

import mu.KotlinLogging
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class EventPublish(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    private val logger = KotlinLogging.logger {}

    fun publish(any: Any) {
        val event = EventModel(any)
        applicationEventPublisher.publishEvent(event)

        logger.info { "publish event $any" }
    }
}
