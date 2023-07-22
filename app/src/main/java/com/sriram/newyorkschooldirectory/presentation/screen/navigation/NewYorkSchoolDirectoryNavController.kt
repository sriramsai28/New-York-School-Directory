package com.sriram.newyorkschooldirectory.presentation.screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NewYorkSchoolDirectoryNavController(
 navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination ) {
        home(
            navController = navController,
        )
    }
}