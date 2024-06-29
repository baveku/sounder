package dev.josbach.utilities

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform