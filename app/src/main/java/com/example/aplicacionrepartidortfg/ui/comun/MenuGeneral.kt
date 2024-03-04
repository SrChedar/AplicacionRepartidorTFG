package com.example.aplicacionrepartidortfg.ui.comun

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuGeneral(navController : NavHostController){
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .height(100.dp)
            .fillMaxSize(),

    ){
        Text(
            text = "AppLibre",
            modifier = Modifier
                .align(Alignment.Center),
            style = TextStyle(
                fontSize = 28.sp,
            )
        )
    }
}