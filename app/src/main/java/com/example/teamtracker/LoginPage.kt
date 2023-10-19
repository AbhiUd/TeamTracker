package com.example.teamtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teamtracker.logo_page.csiApp
import com.example.teamtracker.ui.theme.TeamTrackerTheme
import kotlinx.coroutines.delay


//@Composable
//fun AppNavigation() {
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = "splash_screen"
//    ) {
//        composable("splash_screen") {
//            SplashScreen(navController = navController)
//        }
//        composable("next_screen") {
//            NextScreen()
//        }
//    }
//}

//@Composable
//fun SplashScreen(navController: NavHostController) {
//fun SplashScreen(navController: NavHostController) {
//fun SplashScreen(navController: NavHostController) {
//    // Use rememberCoroutineScope to launch a coroutine
//    val coroutineScope = rememberCoroutineScope()
//
//    LaunchedEffect(key1 = true) {
//        // Delay for 5 seconds
//        delay(5000)
//
//        // Navigate to the next screen
//        navController.navigate("next_screen")
//    }
//
//    // UI for splash screen
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//
//    ) {
//
//    }
//}

@Composable
fun NextScreen() {
    // UI for the next screen
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        // Add your next screen UI components here
    }
}

