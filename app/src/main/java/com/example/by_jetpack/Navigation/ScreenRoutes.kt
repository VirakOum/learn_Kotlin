package com.example.by_jetpack.Navigation

sealed class ScreenRoutes (val route: String) {
    object Home : ScreenRoutes("home")
    object Search : ScreenRoutes("search")
    object Profile : ScreenRoutes("profile/{userId}") {
        fun createRoute(userId: String) = "profile/$userId"

    }
}
