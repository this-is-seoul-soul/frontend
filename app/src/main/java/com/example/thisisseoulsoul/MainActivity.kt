package com.example.thisisseoulsoul

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.thisisseoulsoul.ui.theme.ThisIsSeoulSoulTheme
import com.example.thisisseoulsoul.util.BottomNavigationBar
import com.example.thisisseoulsoul.util.Screens
import com.example.thisisseoulsoul.view.home.HomeScreen
import com.example.thisisseoulsoul.view.landing.LandingScreen
import java.util.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThisIsSeoulSoulTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreenView()
                }
            }
        }
    }
}

@Composable
fun MainScreenView() {
    val isLogin = Random().nextBoolean()
    if(isLogin) {
        BottomNavigationBar()
    }
    else {
        Text(text = "This is Seoul Soul!")
        Button(onClick = {
        }) {
            Text(text = "소셜 로그인")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThisIsSeoulSoulTheme {
        Text("This Is Seoul Soul")
    }
}

