package com.example.teamtracker

import SponStud
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.teamtracker.components.names
import com.example.teamtracker.ui.theme.Background
import com.example.teamtracker.ui.theme.TeamTrackerTheme
import org.w3c.dom.NameList

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
//                    AppNavigation()
//                    target()
//                    Details()
                    SponStud()
                }




            }
        }
    }
}

