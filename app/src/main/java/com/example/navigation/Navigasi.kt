package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

enum class  Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavController = rememberNavController()
){

}