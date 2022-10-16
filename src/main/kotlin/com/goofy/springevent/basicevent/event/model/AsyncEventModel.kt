package com.goofy.springevent.basicevent.event.model

import org.springframework.context.ApplicationEvent

data class AsyncEventModel(
    val message: String
) : ApplicationEvent(message)
