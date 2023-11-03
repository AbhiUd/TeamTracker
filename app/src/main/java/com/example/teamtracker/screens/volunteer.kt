package com.example.teamtracker.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
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
import com.example.teamtracker.components.PageIcon
import com.example.teamtracker.ui.theme.bhura

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
                    color = Color(0xFFBCBEFA),
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                ) ){


            Column(horizontalAlignment = Alignment.CenterHorizontally
                ,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp)) {
                Box(modifier = Modifier
                    .background(color = bhura, shape = RoundedCornerShape(10.dp))
                    .width(322.dp)
                    .height(51.dp)

                ){
                    showDatePicker()
                }
                Spacer(modifier = Modifier.height(15.dp))
                Box(modifier = Modifier
                    .background(color = bhura, shape = RoundedCornerShape(10.dp))
                    .width(322.dp)
                    .height(51.dp)

                ){
                    ShowTimePicker(name = "In")
                }
                Spacer(modifier = Modifier.height(15.dp))
                Box(modifier = Modifier
                    .background(color = bhura, shape = RoundedCornerShape(10.dp))
                    .width(322.dp)
                    .height(51.dp)

                ){
                    ShowTimePicker(name = "Out")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Select reason for absence", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                AbsenceBox(reason = "Publicity / Awareness")
                Spacer(modifier = Modifier.height(5.dp))
                AbsenceBox(reason ="Sponsorship")

//                DateBox(showDatePicker())
//                DateBox(ShowTimePicker())
//                DateBox(ShowTimePicker())

            }


        }
    }
}


@Composable
fun AbsenceBox(reason: String){
    Box(modifier = Modifier
        .height(54.dp)
        .width(323.dp)
        .background(color = bhura, shape = RoundedCornerShape(15.dp))){
        Text(text = reason, fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 5.dp).offset(5.dp,8.dp))
    }
}


