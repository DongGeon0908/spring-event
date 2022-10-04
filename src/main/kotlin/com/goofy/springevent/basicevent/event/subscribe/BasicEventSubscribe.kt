package com.goofy.springevent.basicevent.event.subscribe

import com.goofy.springevent.basicevent.event.model.BasicEventModel
import mu.KotlinLogging
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class BasicEventSubscribe : ApplicationListener<BasicEventModel> {
    private val logger = KotlinLogging.logger {}

    override fun onApplicationEvent(event: BasicEventModel) {
        logger.info { "event -> ${event.message}" }
    }
}
