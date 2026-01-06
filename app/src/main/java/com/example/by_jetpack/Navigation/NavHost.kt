package com.example.by_jetpack.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route
    ) {

        composable(ScreenRoutes.Home.route) {
            HomeScreen()
        }

        composable(ScreenRoutes.Search.route) {
            SearchScreen()
        }

        composable(ScreenRoutes.Profile.route) {
            ProfileScreen()
        }
    }
}
