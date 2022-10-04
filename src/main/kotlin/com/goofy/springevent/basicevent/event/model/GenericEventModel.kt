package com.goofy.springevent.basicevent.event.model

data class GenericEventModel<T>(
    val message: T,
    val status: Boolean
)
