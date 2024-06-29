package dev.josbach.model

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform