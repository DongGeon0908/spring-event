package com.goofy.springevent.basicevent.presentation

import com.goofy.springevent.basicevent.service.EventService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/spring-event/v1")
class EventController(
    private val eventService: EventService
) {
    @GetMapping("/basic-event")
    fun basicEvent() = eventService.defaultEvent()

    @GetMapping("/annotation-event")
    fun annotationEvent() = eventService.annotationEvent()

    // TODO : subscribe가 제대로 작동하지 않음 <- 변경 필요
    @GetMapping("/generic-event")
    fun genericEvent() = eventService.genericEvent()
}
