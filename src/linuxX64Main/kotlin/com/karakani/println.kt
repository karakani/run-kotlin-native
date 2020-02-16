package com.karakani

internal actual fun println(text: String) {
    kotlin.io.println(text)
}