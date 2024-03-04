package com.example.aplicacionrepartidortfg.ui.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aplicacionrepartidortfg.ui.comun.MenuGeneral

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavHostController){
    Scaffold (
        topBar = {
            MenuGeneral(
                navController
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                LazyColumn {
                    item {
                        Text(
                            text = "Buzones Guardados",
                            modifier = Modifier
                                .padding(top = 120.dp),
                            style = TextStyle(
                                fontSize = 28.sp,
                            )
                        )
                        Card(
                            modifier = Modifier
                                .width(800.dp)
                                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                                .height(120.dp)
                        ){
                            Text(
                                text = "Texto2"
                            )
                        }
                    }
                }
            }
        },
        bottomBar = {

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate("AnadirBuzon") },
                containerColor = Color.Yellow,
                contentColor = Color.Black,
                modifier = Modifier
                    .padding(16.dp)
                    .size(65.dp),
                content = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
                }
            )
        },
    )
}