package com.ampnet.aeppsdk

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class AeTest {

    @Test
    fun helloWorldTest() {
        val api = Ae.build("test-url")
        val message = api.helloWorld()
        assertEquals(
                "Hello World! (message sent from Ae library)",
                message,
                "HelloWorld api message not correct."
        )
    }

}