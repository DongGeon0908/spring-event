package com.goofy.springevent.basicevent.event.subscribe

import com.goofy.springevent.basicevent.event.model.GenericEventModel
import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class GenericEventSubscribe {
    private val logger = KotlinLogging.logger {}

    @EventListener
    fun subscribe(event: GenericEventModel<String>) {
        logger.info { "event -> $event" }
    }
}
