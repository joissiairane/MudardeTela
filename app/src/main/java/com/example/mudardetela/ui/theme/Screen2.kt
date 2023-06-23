package com.example.mudardetela.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun  Screen2 (navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title =  { Text(text = "Screen 1" ) })
        }

    ) {
        // Conteúdo da tela
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Screen 2" )
            Button(onClick = {navController.popBackStack()}) {
                Text(text = "Voltar")
            }

            //Button(onClick = {navController.navigateUp()}) {
             //   Text(text = "Voltar" )
           // }
        }
    }
}