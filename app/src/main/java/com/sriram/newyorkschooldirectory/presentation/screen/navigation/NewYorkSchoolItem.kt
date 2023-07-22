package com.sriram.newyorkschooldirectory.presentation.screen.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sriram.newyorkschooldirectory.domain.model.NewYorkSchool

@Composable
fun NewYorkSchoolItem(
    newYorkSchool: NewYorkSchool,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "School Name: ${newYorkSchool.school_name}",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            if(!newYorkSchool.overview_paragraph.isNullOrBlank()) {
                Text(
                    text = newYorkSchool.overview_paragraph,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 10.sp
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "First Brewed on: ${newYorkSchool.school_email} ",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End,
                fontSize = 8.sp
            )
        }
    }
}