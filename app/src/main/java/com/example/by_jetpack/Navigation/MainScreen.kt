package com.example.by_jetpack.Navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.core.net.toUri
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    val items = listOf(
        ScreenRoutes.Home,
        ScreenRoutes.Search,
        ScreenRoutes.Profile
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val currentRoute =
                    navController.currentBackStackEntryAsState().value?.destination?.route

                items.forEachIndexed { index,screen ->
                    NavigationBarItem(
                        selected = currentRoute == screen.route,
                        onClick = {
                            println("Navigating to ${items.elementAt(index).route}");
                            println("Current route is ${screen.route}");
                            if (screen.route.toString()==items.elementAt(index).route.toString()){
                                println("Already on the ${screen.route} screen");
                                navController.navigate(
                                    ScreenRoutes.Profile.createRoute("5")
                                )                            }
                            navController.navigate(screen.route) {

                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = when (screen) {
                                    ScreenRoutes.Home -> Icons.Default.Home
                                    ScreenRoutes.Search -> Icons.Default.Search
                                    ScreenRoutes.Profile -> Icons.Default.Person

                                },
                                contentDescription = screen.route
                            )
                        },
                        label = { Text(screen.route) }
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(Modifier.padding(innerPadding)) {
            AppNavHost(navController)
        }
    }
}
