package com.goofy.springevent.basicevent.event.publish

import com.goofy.springevent.basicevent.event.model.AsyncEventModel
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class AsyncEventPublish(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun publish(message: String) {
        val event = AsyncEventModel(message)
        applicationEventPublisher.publishEvent(event)
    }
}
