package com.example.teamtracker.logo_page


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teamtracker.NextScreen
import com.example.teamtracker.R
import com.example.teamtracker.screens.Attendance
import com.example.teamtracker.screens.Lead
import com.example.teamtracker.screens.Loginpage
import com.example.teamtracker.screens.Sponsorship
import com.example.teamtracker.screens.Sponsorship_details
import com.example.teamtracker.screens.Volunteer
import com.example.teamtracker.screens.approval
import com.example.teamtracker.ui.theme.Cyan
import kotlinx.coroutines.delay


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Logo_Page"
    ) {
        composable("Logo_Page") {
            csiApp(navController = navController)
        }
        composable("next_screen") {
            NextScreen(navController = navController)
        }
        composable("Volunteer_Login_page") {
//            Loginpage(navController= NavController)
            Loginpage(individual = "Volunteer", navController = navController )
        }

        composable("Lead_Login_page") {
            Loginpage(individual = "Lead", navController = navController )
        }
        composable("Lead_main_page"){
            Lead(navController = navController)
        }
        composable("Volunteer_main_page"){
            Volunteer(navController = navController)
        }
        composable("Attendance_Approval") {
            approval(navController = navController )
        }
        composable("Sponsorship_Details") {
            Sponsorship_details(navController = navController)
        }
        composable("Attendance") {
            Attendance(navController = navController)
        }
        composable("Sponsorship") {
            Sponsorship(navController = navController)
        }
    }
}

@Composable
fun csiApp(navController: NavHostController) {

    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(key1 = true) {
        // Delay for 2 seconds
        delay(2000)

        // Navigate to the next screen
        navController.navigate("next_screen")
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
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "from",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp
            ),
            color = Color.White
        )
        Text(
            text = "CSI",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            ),
            color = Cyan
        )


    }


}


