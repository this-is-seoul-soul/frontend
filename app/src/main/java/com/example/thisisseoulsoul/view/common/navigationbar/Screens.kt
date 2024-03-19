package com.example.thisisseoulsoul.view.common.navigationbar

sealed class Screens(val route : String) {
    object Home : Screens("home_screen")
    object Map : Screens("map_screen")
    object Heart : Screens("heart_screen")
    object Profile : Screens("profile_screen")
}