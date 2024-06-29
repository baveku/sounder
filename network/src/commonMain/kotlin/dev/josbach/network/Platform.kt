package dev.josbach.network

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform