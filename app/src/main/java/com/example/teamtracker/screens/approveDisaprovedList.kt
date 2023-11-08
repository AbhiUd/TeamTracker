package com.example.teamtracker.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp







@Composable
fun ApprovedList(approvedNames: List<String>) {
    commonbox(value ="Approved Students" ) {


        Column {
            Text(
                text = "Approved Names:",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
            approvedNames.forEach { name ->
                Text(text = name, fontSize = 18.sp, modifier = Modifier.padding(8.dp))
            }
        }
    }
}


@Composable
fun DisapprovedList(disapprovedNames: List<String>) {
    commonbox(value = "Disapproved Students") {


        Column {
            Text(
                text = "Disapproved Names:",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
            disapprovedNames.forEach { name ->
                Text(text = name, fontSize = 18.sp, modifier = Modifier.padding(8.dp))
            }
        }
    }
}


