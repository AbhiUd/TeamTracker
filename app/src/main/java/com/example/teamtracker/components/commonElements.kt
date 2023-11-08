package com.example.teamtracker.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var names = listOf("Omkar", "Abhishek", "Neel", "David", "Eve", "Frank", "Grace", "Holly", "Ivy", "Jack")
var des = listOf("Morning whispers, a sky ablaze with pink and gold. Birds sing, greeting a new day. The world awakens, a garden of endless possibilities.","Out for sponsporship purpose","My self APP","My self APP","My self APP","My self APP","My self APP","Out for sponsporship purpose","Out for sponsporship purpose","Out for sponsporship purpose")

@Composable
fun element(value : String){ Text(
            text = value,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 80.dp),
//            Style = androidx.compose.ui.text.TextStyle(
                 fontSize = 18.sp,
                //fontWeight = FontWeight.Normal,
                //fontStyle = FontStyle.Normal
            )
}

@Composable
fun PageIcon(painterResource: Painter){
    Image(
        painter = painterResource,
        contentDescription = "",
        modifier = Modifier
            .width(58.dp)
            .height(58.dp)
    )
}