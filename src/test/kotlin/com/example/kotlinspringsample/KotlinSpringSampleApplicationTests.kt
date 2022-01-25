package com.example.kotlinspringsample

import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinSpringSampleApplicationTests : DescribeSpec() {
    @MockkBean
    private lateinit var greetingService: GreetingService

    @Autowired
    private lateinit var controller: GreetingController

    init {
        it("should greet by delegating to the greeting service") {
            every { greetingService.greet("John") } returns "Hi John"

            controller.greet("John") shouldBe "Hi John"
            verify { greetingService.greet("John") }
        }
    }
}
