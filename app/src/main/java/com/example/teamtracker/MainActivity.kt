package com.example.teamtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.teamtracker.logo_page.AppNavigation
import com.example.teamtracker.screens.Lead
import com.example.teamtracker.screens.ShowTimePicker
import com.example.teamtracker.screens.approval
import com.example.teamtracker.screens.showDatePicker
import com.example.teamtracker.ui.theme.Background
import com.example.teamtracker.ui.theme.TeamTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TeamTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Background
                ) {
                   AppNavigation()
//                    Loginpage()
//                    publicity()


//                    ShowTimePicker()
//                    showDatePicker(context = this)
//                    Lead()
//                    approval()
                }




            }
        }
    }
}

