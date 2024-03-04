package com.example.aplicacionrepartidortfg.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacionrepartidortfg.ui.pantallas.Home
import com.example.aplicacionrepartidortfg.ui.pantallas.Login

@Composable
fun AppNavegacion() {
    val navigationController = rememberNavController()

    NavHost(navController = navigationController, startDestination = AppScreens.Login.ruta) {

        composable(AppScreens.Home.ruta) { Home(navController=navigationController) }
        composable(AppScreens.Login.ruta) { Login(navController = navigationController) }
    }
}