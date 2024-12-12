package com.example.protrack.navigation

sealed class AppScreen(val ruta: String) {
    object FirstScreen: AppScreen("first_screen")
    object SecondScreen: AppScreen("second_screen")
    object ThirdScreen: AppScreen("third_screen")
}