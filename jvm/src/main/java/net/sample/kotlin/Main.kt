package net.sample.kotlin

import net.sample.mpp.MppException

class Main {
    companion object {
        fun main() {
            try {
                println("Hello Mpp")
            } catch (e: MppException) {
                // MppException is correctly recognized
                println("Oops")
            }
        }
    }
}