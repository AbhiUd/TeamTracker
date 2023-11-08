package com.example.teamtracker

import SponStud
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.teamtracker.logo_page.AppNavigation
import com.example.teamtracker.screens.Details
import com.example.teamtracker.ui.theme.Background
import com.example.teamtracker.ui.theme.TeamTrackerTheme
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : ComponentActivity() {


//    val firebase: DatabaseReference= FirebaseDatabase.getInstance().getReference()

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
//                    target()
//                    Details()
//                    SponStud()
//                    Details()
                }




            }
        }
    }
}

