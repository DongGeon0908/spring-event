package com.goofy.springevent.basicevent.presentation

import com.goofy.springevent.basicevent.service.BasicEventService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/spring-event/v1/basic-event")
class BasicEventController(
    private val basicEventService: BasicEventService
) {
    @GetMapping("/hello-world")
    fun helloWorld() = basicEventService.helloWorld()
}
