package com.goofy.springevent.basicevent.event.subscribe

import com.goofy.springevent.basicevent.event.model.AnnotationEventModel
import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class AnnotationEventSubscribe {
    private val logger = KotlinLogging.logger {}

    @EventListener
    fun subscribe(event: AnnotationEventModel) {
        logger.info { "event -> ${event.message}" }
    }
}
