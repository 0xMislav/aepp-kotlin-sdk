package com.ampnet.aeppsdk

/**
 * This class exposes complete set of features currently implemented and
 * used for communicating with Epoch node using HTTP APIs.
 */
class Ae {

    companion object {

        fun build(serviceUrl: String): Ae {
            return Ae() // TODO("Initialize Ae object with URL where Epoch node is running, think this through.")
        }

    }

    /**
     * Example functionality for testing purposes. This code should never be here,
     * it should rather be moved to adequate package/service layer.
     */
    fun helloWorld(): String {
        return "Hello World! (message sent from Ae library)"
    }

}