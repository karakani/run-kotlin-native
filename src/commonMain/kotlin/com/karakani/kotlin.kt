package com.karakani

class KotlinMain(private val name: String) {
    fun run() {
        println("Hello Kotlin/Native on ${name}!")
    }
}

internal expect fun println(text: String)
