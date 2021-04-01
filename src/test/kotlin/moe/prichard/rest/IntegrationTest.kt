package moe.prichard.rest

import org.junit.jupiter.api.BeforeAll
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class IntegrationTest() {

    @BeforeAll
    fun setup() {
        println(">> Startup")
    }
}