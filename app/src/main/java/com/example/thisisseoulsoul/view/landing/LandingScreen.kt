package com.example.thisisseoulsoul.view.landing

import androidx.navigation.compose.rememberNavController
import com.example.thisisseoulsoul.ui.theme.ThisIsSeoulSoulTheme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.thisisseoulsoul.view.common.navigationbar.Screens

@Composable
fun LandingScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Greeting(name = "Landing")
        Button(onClick = {
            navController.navigate(Screens.Home.route)
        }) {
            Text("Go to Home")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingScreenPreview() {
    ThisIsSeoulSoulTheme {
        LandingScreen(navController = rememberNavController())
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThisIsSeoulSoulTheme {
        Greeting("Android")
    }
}