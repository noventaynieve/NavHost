package com.example.navhost.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Profile : Routes("profile")
}