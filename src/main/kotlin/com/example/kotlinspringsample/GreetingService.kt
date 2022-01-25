package com.example.kotlinspringsample

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun greet(name: String) = "Hi, $name"
}
