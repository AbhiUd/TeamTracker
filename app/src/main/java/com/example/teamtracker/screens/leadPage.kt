package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.Cyan
import com.example.teamtracker.ui.theme.SpanColor
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Lead () {
    Column(horizontalAlignment = Alignment.Start) {
        TTLogo()
        Spacer(modifier = Modifier.height(30.dp))
        Hello("Lead")
        Spacer(modifier = Modifier.height(60.dp))

        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
            ) {
//            Spacer(modifier = Modifier.width(10.dp))
            MainBox(name = "ATTENDANCE", painterResource = painterResource(id = R.drawable.attendance))
            Spacer(modifier = Modifier.width(30.dp))
            MainBox(name = "SPONSORSHIP DETAILS", painterResource = painterResource(id = R.drawable.sponsorship))
        }
    }
}

@Composable
fun TTLogo(){
    Image(
        painter = painterResource(id = R.drawable.tt),
        contentDescription = "Team Tracker",
        modifier = Modifier
            .height(81.dp)
            .width(99.dp)
            .offset(0.dp, 10.dp)

    )
}

@Composable
fun Hello(Name: String){
    Text(text = buildAnnotatedString {
        append("Hello ")
        withStyle(
            style = SpanStyle(
                color = SpanColor,
                fontSize = 30.sp
            )
        ){
            append(Name)
        }
        append(" !")
    },
        color = Color.White,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.offset(10.dp,10.dp)
    )

}

@Composable
fun MainBox(name: String,painterResource: Painter ){
    Box(
        modifier = Modifier
            .height(145.dp)
            .width(153.dp)
            .background(color = Cyan, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource,
                contentDescription = "Attendance Logo",
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = name,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                ),
                textAlign = TextAlign.Center


            )
        }
    }
}