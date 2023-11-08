package com.example.teamtracker.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.teamtracker.R


@Composable
fun sponsorship(navController: NavController,page: String) {
    commonbox(value = "Sponsorships") {
        Column (horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(top = 60.dp)){
            options("FOOD",navController,page)
            options("EDUCATIONAL",navController,page)
            options("PROMOTION",navController,page)
            options("OTHERS",navController,page)
        }
    }
}

@Composable
fun options(text: String, navController: NavController,page: String) {
        Box(
            modifier = Modifier
                .clickable {
                    if (page=="Seeking")
                    navController.navigate("target")
                    else navController.navigate("TargetVol")
                }
                .padding(8.dp)
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                .height(48.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Row(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 35.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(id = R.drawable.button),
                    contentDescription = "",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .align(alignment = Alignment.CenterVertically)
                        .padding(end = 30.dp)
                )


                Text(
                    text = text,
                    color = Color.Black,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
}
