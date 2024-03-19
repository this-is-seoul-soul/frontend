package com.example.thisisseoulsoul.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(val label : String = "",
                                val icon : ImageVector = Icons.Rounded.Home,
                                val route : String = "") {
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                "Home",
                Icons.Rounded.Home,
                Screens.Home.route
            ),
            BottomNavigationItem(
                "Map",
                Icons.Rounded.Place,
                Screens.Map.route
            ),
            BottomNavigationItem(
                "Heart",
                Icons.Rounded.Favorite,
                Screens.Heart.route
            ),
            BottomNavigationItem(
                "My",
                Icons.Rounded.Person,
                Screens.Profile.route
            )
        )
    }
}