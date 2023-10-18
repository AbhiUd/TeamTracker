package com.example.teamtracker.components

import android.graphics.Paint.Style
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text
import java.time.format.TextStyle

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