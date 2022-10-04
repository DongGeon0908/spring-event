package com.goofy.springevent.basicevent.event.publish

import com.goofy.springevent.basicevent.event.model.GenericEventModel
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class GenericEventPublish<T>(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun publish(message: T) {
        val event = GenericEventModel(message, true)
        applicationEventPublisher.publishEvent(event)
    }
}
