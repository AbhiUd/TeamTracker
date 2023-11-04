package com.example.teamtracker.screens
import androidx.compose.foundation.background
import androidx.compose.material3.Card
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.runtime.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight


@Composable
fun target(){

    commonbox(value = "Sponsorship") {
        aggregate()
    }
}


@Composable
fun aggregate() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .height(352.dp)
                .width(350.dp)
                .background(
                    color = Color(0xFFAD9595),
                    shape = RoundedCornerShape(16.dp)
                )
        )
        {
            Column (
                modifier = Modifier.padding(10.dp)
            ){
                MyTextField("Description :- " ,5 )
                entry("Target :-")
                entry(labelText = "Aggregate  :- ")
            }

        }

            Submit()
    }
}




@Composable
fun entry(labelText: String) {
    var numberInput by remember { mutableStateOf("") }

    Row ( modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically){
        Text(
            text = labelText,
            modifier = Modifier.padding( 20.dp),
            color = Color.Black,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Card(
            modifier = Modifier
                .height(60.dp)
                .width(200.dp)
                .padding(10.dp),
            shape = RoundedCornerShape(10.dp),
        ) {
            BasicTextField(
                value = numberInput,
                onValueChange = {
                    numberInput = it
                },
                textStyle = TextStyle(fontSize = 24.sp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                ),
                singleLine = true
            )
        }
    }
}







