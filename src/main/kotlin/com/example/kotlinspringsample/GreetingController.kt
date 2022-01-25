package com.example.kotlinspringsample

import org.springframework.stereotype.Controller

@Controller
class GreetingController(private val greetingService: GreetingService) {
    fun greet(name: String) = greetingService.greet(name)
}
