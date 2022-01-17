package com.example.kotlinspringsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringSampleApplication

fun main(vararg args: String) {
    runApplication<KotlinSpringSampleApplication>(*args)
}
