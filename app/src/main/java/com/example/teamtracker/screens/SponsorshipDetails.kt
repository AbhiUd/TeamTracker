package com.example.teamtracker.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.R
import com.example.teamtracker.components.PageIcon
import com.example.teamtracker.ui.theme.brown




@Composable
fun Details()
{

    commonbox2("SPONSORSHIP DETAILS"){
        seenToLead()
    }
}



@Composable
fun commonbox2(value: String,content: @Composable () -> Unit) {
    Column(horizontalAlignment = Alignment.Start) {
        TTLogo()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Heading(name = value)
        Spacer(modifier = Modifier.height(10.dp))
        PageIcon(painterResource = painterResource(id = R.drawable.sponsorshipcyan))
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .height(530.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)
                )
        ) {

            content()
        }
    }
}


@Composable
fun seenToLead() {
    Column(modifier = Modifier.padding(top = 40.dp)) {

        Box("Target :-")
        Box(value = "Aggregate:-")
        Box(value = "Deficit :-")
    }
}

@Composable
fun Box(value: String){
    Column(modifier = Modifier.padding(top = 35.dp)
        ) {

        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .heightIn(66.dp)
                .width(360.dp)
                .padding(start = 20.dp)
                .background(
                    brush = Brush.horizontalGradient(listOf(brown, brown)),
                    shape = RoundedCornerShape(15.dp)
                ),
            contentAlignment = Alignment.CenterStart
        ) {
            Row (){
                Text(
                    modifier = Modifier.padding(start = 20.dp),
                    text = value, color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "123456789", color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
            }
        }
    }

}