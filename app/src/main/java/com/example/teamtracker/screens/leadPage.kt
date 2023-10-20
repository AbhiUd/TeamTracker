package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.teamtracker.R

@Composable
fun lead (){
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo image",
        modifier = Modifier
            .height(81.dp)
            .width(99.dp)
            //.padding(50.dp)
    )
}