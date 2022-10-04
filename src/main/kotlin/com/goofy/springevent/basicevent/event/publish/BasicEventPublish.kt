package com.goofy.springevent.basicevent.event.publish

import com.goofy.springevent.basicevent.event.model.BasicEventModel
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class BasicEventPublish(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun publish(message: String) {
        val event = BasicEventModel(message)
        applicationEventPublisher.publishEvent(event)
    }
}
