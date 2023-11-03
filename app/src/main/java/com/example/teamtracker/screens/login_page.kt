package com.example.teamtracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.Background
import com.example.teamtracker.ui.theme.Btnbackground
import com.example.teamtracker.ui.theme.Cyan
import com.example.teamtracker.ui.theme.componentShapes


@Composable
fun Loginpage(individual: String, navController: NavController) {


    Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo image",
            modifier = Modifier
                .height(320.dp)
                .width(320.dp)

        )
        Spacer(modifier = Modifier.height(30.dp))

        MyTextField(labelValue = "Login Id",2)
        Spacer(modifier = Modifier.height(30.dp))
        PasswordTextField(labelValue = "Password")
        Spacer(modifier = Modifier.height(40.dp))
        ButtonComponent(
            value = stringResource(id = R.string.register),
            individual =individual, navController =navController)
        
        

    }



}



/*@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MyTextField(labelValue: String,value : Int) {
    val textValue = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .width(350.dp)
            .height(68.dp)
            .background(
                color = Btnbackground,
                shape = RoundedCornerShape(8.dp)
            )
//            .clip(componentShapes.small)
    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(68.dp)
                .clip(componentShapes.medium),
            label = { Text(text = labelValue) },
            // Set background color here
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Btnbackground,
                focusedLabelColor = Background,
                cursorColor = Btnbackground,

                ),
            keyboardOptions = KeyboardOptions.Default,
            value = textValue.value,
            onValueChange = {
                textValue.value = it
            },
            maxLines = value
        )
    }
}*/




@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MyTextField(labelValue: String , value : Int) {
    val textValue = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .width(350.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Btnbackground,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 68.dp), // Allow vertical expansion
                label = { Text(text = labelValue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp) },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Btnbackground,
                    focusedLabelColor = Background,
                    cursorColor = Btnbackground
                ),
                keyboardOptions = KeyboardOptions.Default,
                value = textValue.value,
                onValueChange = {
                    textValue.value = it
                },
                maxLines = value
            )
        }
    }
}



@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PasswordTextField(labelValue: String) {
    val Password = remember {
        mutableStateOf("")
    }

    val PasswordVisible = remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .width(350.dp)
            .height(68.dp)
            .background(
                color = Btnbackground,
                shape = RoundedCornerShape(8.dp)
            )
//            .clip(componentShapes.small)
    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(68.dp)
                .clip(componentShapes.medium),
            label = { Text(text = labelValue) },
            // Set background color here
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Btnbackground,
                focusedLabelColor = Background,
                cursorColor = Btnbackground,

                ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            value = Password.value,
            onValueChange = {
                Password.value = it
            },
            trailingIcon = {
                val iconIamge = if(PasswordVisible.value){
                    Icons.Filled.Visibility
                }else{
                    Icons.Filled.VisibilityOff
                }

                var description = if(PasswordVisible.value){
                    stringResource(id = R.string.hide_password)
                }else{
                    stringResource(id = R.string.show_password)
                }
                IconButton(onClick = { PasswordVisible.value= !PasswordVisible.value}) {
                    androidx.compose.material3.Icon(imageVector = iconIamge, contentDescription = description)
                }
            },
            visualTransformation = if (PasswordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
        )
    }
}


@Composable
fun ButtonComponent(value: String, individual: String, navController: NavController){
    Button(onClick = {
                     if (individual=="Lead") navController.navigate("Lead_main_page")
        else navController.navigate("Volunteer_main_page")
    },
        modifier = Modifier
            .heightIn(57.dp)
            .width(239.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)
    ) {
        Box(modifier = Modifier
            .heightIn(57.dp)
            .width(239.dp)
            .background(
                brush = Brush.horizontalGradient(listOf(Cyan,Cyan)),
                shape = RoundedCornerShape(50.dp)
            ),
            contentAlignment = Alignment.Center
        ){
            Text(text = value,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
                )
        }
    }
}
