package com.goofy.springevent.basicevent.service

import com.goofy.springevent.basicevent.event.publish.BasicEventPublish
import org.springframework.stereotype.Service

@Service
class BasicEventService(
    private val basicEventPublish: BasicEventPublish
) {
    fun helloWorld(): String {
        val message = "Hello World~!"

        basicEventPublish.publish(message)

        return message
    }
}
