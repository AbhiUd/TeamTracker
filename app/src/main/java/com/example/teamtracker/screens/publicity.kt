package com.example.teamtracker.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.ui.theme.bhura
import com.example.teamtracker.ui.theme.submit


@Composable
fun publicity() {
    commonbox(value = "Publicity/Awareness") {
        publicityBox()
    }
}

@Composable
fun commonbox(value: String, content: @Composable () -> Unit) {
    Column(horizontalAlignment = Alignment.Start) {
        TTLogo()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Heading(name = value)
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .height(602.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA),
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                )
        ) {
            content()
        }
    }
}

@Composable
fun publicityBox() {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Box(
            modifier = Modifier
                .height(310.dp)
                .width(350.dp)
                .background(
                    color = Color(0xFFAD9595),
                    shape = RoundedCornerShape(16.dp)
                )

        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                MyTextField("Tasks Completed" ,8 )

                Spacer(modifier = Modifier.height(40.dp))

            }


            }
        }

    Spacer(modifier = Modifier.height(40.dp))
Submit()
}



@Composable
fun Submit()
{
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 40.dp),
        contentAlignment = Alignment.BottomCenter
    )
    {
        Button(
            onClick = {},
            modifier = Modifier
                .heightIn(57.dp)
                .width(239.dp),
            contentPadding = PaddingValues(),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.Transparent),
        ) {
            Box(
                modifier = Modifier
                    .heightIn(57.dp)
                    .width(239.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(submit, bhura)),
                        shape = RoundedCornerShape(50.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "SUBMIT", color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )
            }


        }
    }
}
