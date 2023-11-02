package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.teamtracker.R
import com.example.teamtracker.components.PageIcon

@Composable
fun Sponsorship(navController: NavController){
    Column(horizontalAlignment = Alignment.Start) {


        TTLogo()
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Heading(name = "SPONSORSHIP")

        Spacer(modifier = Modifier.height(10.dp))

        PageIcon(painterResource = painterResource(id = R.drawable.sponsorshipcyan))
        
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .height(530.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA)
                ) ){

        }
    }
}


@Composable
fun Attendance(navController: NavController) {

    Column(horizontalAlignment = Alignment.Start) {


        TTLogo()
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Heading(name = "ATTENDANCE SEEKING")

        Spacer(modifier = Modifier.height(10.dp))

        PageIcon(painterResource = painterResource(id = R.drawable.attendance))
        
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .height(530.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA)
                ) ){

        }
    }
}
