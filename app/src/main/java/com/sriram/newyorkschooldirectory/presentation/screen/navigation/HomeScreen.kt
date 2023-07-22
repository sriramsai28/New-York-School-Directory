package com.sriram.newyorkschooldirectory.presentation.screen.navigation

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import com.sriram.newyorkschooldirectory.presentation.viewmodel.NewYorkSchoolViewModel

@Composable
fun HomeScreen(
    navController: NavController
) {
    val viewModel = hiltViewModel<NewYorkSchoolViewModel>()
    val data = viewModel.newYorkSchoolFlow.collectAsLazyPagingItems()
    val context = LocalContext.current
    LaunchedEffect(key1 = data.loadState) {
        if (data.loadState.refresh is LoadState.Error) {
            Toast.makeText(
                context,
                "Error:" + (data.loadState.refresh as LoadState.Error).error.message,
                Toast.LENGTH_LONG
            ).show()
        }
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        if (data.loadState.refresh is LoadState.Loading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(
                    count = data.itemCount,
                    key = data.itemKey {it.id},
                ) {
                    val newYorkSchool = data[it]
                    newYorkSchool?.let {
                        NewYorkSchoolItem(newYorkSchool = newYorkSchool, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))

                    }
                }

                item{
                    if (data.loadState.append is LoadState.Loading) {
                        CircularProgressIndicator(
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}