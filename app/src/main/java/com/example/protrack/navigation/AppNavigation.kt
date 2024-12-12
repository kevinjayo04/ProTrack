package com.example.protrack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.protrack.screens.FirstScreen
import com.example.protrack.screens.SecondScreen
import com.example.protrack.screens.ThridScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.FirstScreen.ruta) {

        composable(route = AppScreen.FirstScreen.ruta) {
            FirstScreen(navController)  // Primera pantalla
        }

        composable(route = AppScreen.SecondScreen.ruta){
            SecondScreen(navController) //segunda pantalla
        }

        composable(route = AppScreen.ThirdScreen.ruta){
            ThridScreen(navController) //tercera ventana
        }

    }
}