package com.goofy.springevent.basicevent.event.publish

import com.goofy.springevent.basicevent.event.model.AnnotationEventModel
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class AnnotationEventPublish(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun publish(message: String) {
        val event = AnnotationEventModel(message)
        applicationEventPublisher.publishEvent(event)
    }
}
