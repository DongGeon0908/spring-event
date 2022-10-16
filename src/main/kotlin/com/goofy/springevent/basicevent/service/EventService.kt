package com.goofy.springevent.basicevent.service

import com.goofy.springevent.basicevent.event.publish.AnnotationEventPublish
import com.goofy.springevent.basicevent.event.publish.AsyncEventPublish
import com.goofy.springevent.basicevent.event.publish.BasicEventPublish
import com.goofy.springevent.basicevent.event.publish.GenericEventPublish
import org.springframework.stereotype.Service

@Service
class EventService(
    private val basicEventPublish: BasicEventPublish,
    private val annotationEventPublish: AnnotationEventPublish,
    private val genericEventPublish: GenericEventPublish<String>,
    private val asyncEventPublish: AsyncEventPublish
) {
    fun defaultEvent(): String {
        val message = "Hello World~!"

        basicEventPublish.publish(message)

        return message
    }

    fun annotationEvent(): String {
        val message = "Hello World~!!!"

        annotationEventPublish.publish(message)

        return message
    }

    fun genericEvent(): String {
        val message = "Yes Hello World~!@!!"

        genericEventPublish.publish(message)

        return message
    }

    fun asyncEvent(): String {
        val message = "비동기로 이벤트 처리"

        asyncEventPublish.publish(message)

        return message
    }
}
