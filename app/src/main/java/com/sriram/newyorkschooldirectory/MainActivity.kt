package com.sriram.newyorkschooldirectory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.sriram.newyorkschooldirectory.presentation.screen.navigation.NewYorkSchoolDirectoryNavController
import com.sriram.newyorkschooldirectory.ui.theme.NewYorkSchoolDirectoryTheme
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewYorkSchoolDirectoryTheme {
                val navController = rememberNavController()
                NewYorkSchoolDirectoryNavController(
                    navController = navController,
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewYorkSchoolDirectoryTheme {
        Greeting("Android")
    }
}