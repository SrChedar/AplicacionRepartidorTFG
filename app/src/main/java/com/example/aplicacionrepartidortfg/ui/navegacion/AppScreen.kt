package com.example.aplicacionrepartidortfg.ui.navegacion

sealed class AppScreens(val ruta: String) {
    //Pantalla Inicio
    object Home: AppScreens("Home")

    object Login: AppScreens("Login")
    object AnadirBuzon: AppScreens("AnadirBuzon")
}