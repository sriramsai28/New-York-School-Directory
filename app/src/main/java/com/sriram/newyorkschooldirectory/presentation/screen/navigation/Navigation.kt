package com.sriram.newyorkschooldirectory.presentation.screen.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val startDestination = "home"
const val detailScreen = ""

fun NavGraphBuilder.home(
    navController: NavHostController,
) {
    composable(
        route = startDestination
    ) {
        HomeScreen(
            navController = navController,
        )
    }
}