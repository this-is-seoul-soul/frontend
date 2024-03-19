package com.example.thisisseoulsoul.view.map

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.thisisseoulsoul.ui.theme.Yellow50

@Composable
fun MapScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Yellow50)
    ) {
        Text("Hello map")
    }
}