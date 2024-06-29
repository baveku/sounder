package dev.josbach.components

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform