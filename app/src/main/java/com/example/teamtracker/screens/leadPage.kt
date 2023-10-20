package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.Cyan

@Composable
fun lead (){

    Column (horizontalAlignment = Alignment.Start    ) {


        Image(
            painter = painterResource(id = R.drawable.tt),
            contentDescription = "Logo image only TT",
            modifier = Modifier
                .height(81.dp)
                .width(99.dp)
                .offset(0.dp, 10.dp)

        )

        Text(
            text = "Hello      !",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            ),
            color = Color.White
        )


    }
}