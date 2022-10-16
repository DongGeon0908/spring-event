package com.goofy.springevent.basicevent.event.subscribe

import com.goofy.springevent.basicevent.event.model.AsyncEventModel
import mu.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class AsyncEventSubscribe {
    private val logger = KotlinLogging.logger {}

    @Async
    @EventListener
    fun subscribe(event: AsyncEventModel) {
        logger.info { "event -> ${event.message}" }
    }
}
