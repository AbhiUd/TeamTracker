package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.componentShapes

@Composable
fun approval() {


    Column(horizontalAlignment = Alignment.Start) {


        Image(
            painter = painterResource(id = R.drawable.tt),
            contentDescription = "Logo image only TT",
            modifier = Modifier
                .height(81.dp)
                .width(99.dp)
                .offset(0.dp, 10.dp)

        )
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ){


        Text(
            text = "ATTENDANCE APPROVAL",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 29.sp
            ),
            color = Color(0xFFAFF6FF),
            modifier = Modifier.padding(top = 135.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.attendance),
            contentDescription = "",
            modifier = Modifier
                .width(58.dp)
                .height(58.dp) )

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            modifier = Modifier.height(530.dp).width(380.dp)
                .background(color = Color(0xFFBCBEFA))
        ) {
            regected("omakr")
        }

    }


}


@Composable
fun regected(value: String){
    Box(
        modifier = Modifier
            .padding(start = 12.dp)
            .width(327.dp)
            .height(66.dp)
            .offset(15.dp,20.dp)
            .clip(RoundedCornerShape(16.dp))

            .background(Color(0xFFD9D9D9)
                )
    ) {
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "",
            modifier = Modifier.align(Alignment.CenterStart)
                .width(41.dp)
                .height(41.dp)
                .padding(start = 6.dp)

                 )

        Text(text = value,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp ),
            modifier = Modifier.align(Alignment.Center)
        )
         
    }
}
