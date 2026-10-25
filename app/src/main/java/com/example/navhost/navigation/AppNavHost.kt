package com.example.navhost.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navhost.Home
import com.example.navhost.Profile

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {
        composable(Routes.Home.route) {
            Home(
                onNavigateToProfile = {
                    navController.navigate(Routes.Profile.route)
                }
            )
        }
        composable(Routes.Profile.route) {
            Profile(
                onNavigateToHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}