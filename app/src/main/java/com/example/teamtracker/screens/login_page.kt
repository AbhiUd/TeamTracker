package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.common

/*
@Composable
fun login_page() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo image",
            modifier = Modifier
                .height(500.dp)
                .width(500.dp)
                .padding(50.dp)
        )
    }
val textValue = remeber{
    mutableSetOf("")
}
    OutlinedTextField(value = , onValueChange = )
}*/



/*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.text.TextStyle
import com.example.teamtracker.ui.theme.common

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BasicTextField(
            value = email,
            onValueChange = { email = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(onNext = { /* Handle action here */ }),
            textStyle = TextStyle(fontSize = 16.sp),
            placeholder = { Text(text = "Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(8.dp)
        )
        BasicTextField(
            value = password,
            onValueChange = { password = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = { /* Handle action here */ }),
            textStyle = TextStyle(fontSize = 16.sp),
            visualTransformation = PasswordVisualTransformation(),
            placeholder = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(8.dp)
        )

        // Add a login button or any other UI elements as needed
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}*/




/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginpage(lableValue: String){
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(label  =  {Text(text = lableValue)} ,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = common,
            focusedLabelColor = common,
            cursorColor = common
        ),
        KeyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
                 textValue.value = it
            },
        )



}*/


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginpage(labelValue: String) {
    val textValue = remember {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo image",
            modifier = Modifier
                .height(500.dp)
                .width(500.dp)
                .padding(50.dp)
        )
    }

    OutlinedTextField(
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = common,
            focusedLabelColor = common,
            cursorColor = common
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
    )
}

