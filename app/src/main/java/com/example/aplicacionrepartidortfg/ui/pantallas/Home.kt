package com.example.aplicacionrepartidortfg.ui.pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDefaults.color
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp

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
                horizontalAlignment = Alignment.CenterHorizontally
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
                        Spacer(modifier = Modifier.size(20.dp))
                        var iconClicked by remember { mutableStateOf(true) }

                        var desplegar: Dp = if (iconClicked) {
                            80.dp
                        } else {
                            120.dp
                        }

                        var variable01: ImageVector = if (iconClicked) {
                            Icons.Default.KeyboardArrowDown
                        } else {
                            Icons.Default.KeyboardArrowUp
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.95f)
                                .height(desplegar)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 20.dp)
                            ) {
                                Row(
                                    Modifier
                                        .fillMaxWidth()
                                        .padding(start = 10.dp, end = 20.dp)
                                ){


                                    Text(
                                        text = "Buzón Calle Guabairo 24",
                                        modifier = Modifier.weight(0.7f),
                                        fontSize = 20.sp,
                                    )
                                    Icon(
                                        imageVector = variable01,
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(34.dp)
                                            .clickable {
                                                if (iconClicked) {
                                                    iconClicked = false
                                                } else {
                                                    iconClicked = true
                                                }
                                            }
                                    )


                                }

                            }
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ){
                            Text(text = "Historial de paquetes")
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