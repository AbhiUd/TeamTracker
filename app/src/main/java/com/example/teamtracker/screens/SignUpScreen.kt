package com.example.teamtracker.screens

import android.support.v4.os.IResultReceiver.Default
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.teamtracker.components.element

@Composable
fun SignUpScreen() {
Surface (color = Color.White,
    modifier = Modifier.fillMaxSize()){
    element(value = "at last")
    Text(text = "hello world")

}
}

@Preview
@Composable
fun DefaultPreviewOfSignupScreen(){
    SignUpScreen()
}