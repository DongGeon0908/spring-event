package com.goofy.springevent.common.event

import org.springframework.context.ApplicationEvent

class EventModel(
    val any: Any
) : ApplicationEvent(any)
