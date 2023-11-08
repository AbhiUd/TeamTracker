package com.example.teamtracker.logo_page


import SponStud
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.teamtracker.NextScreen
import com.example.teamtracker.R
import com.example.teamtracker.screens.ApprovedList
import com.example.teamtracker.screens.Attendance
import com.example.teamtracker.screens.Details
import com.example.teamtracker.screens.DisApprovedList
import com.example.teamtracker.screens.DisapprovedList
import com.example.teamtracker.screens.Lead
import com.example.teamtracker.screens.Loginpage
import com.example.teamtracker.screens.Sponsorship
import com.example.teamtracker.screens.Sponsorship_details
import com.example.teamtracker.screens.Volunteer
import com.example.teamtracker.screens.approval
import com.example.teamtracker.screens.publicity
import com.example.teamtracker.screens.sponsorship
import com.example.teamtracker.screens.target
import com.example.teamtracker.ui.theme.Background
import com.example.teamtracker.ui.theme.Cyan
import com.example.teamtracker.ui.theme.SpanColor
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
            SponStud(navController = navController)
        }
        composable("Attendance") {
            Attendance(navController = navController)
        }
        composable("Sponsorship") {
            sponsorship(navController = navController,"Volunteer")
        }
        composable("Publicity") {
            publicity(navController = navController)
        }
        composable("Sponsorship(Seeking)") {
            sponsorship(navController = navController,"Seeking")
        }
        composable("Target") {
            target(navController = navController, "AttSee")
        }
        composable("Sponsorship Volunteer") {
            sponsorship(navController = navController,"Volunteer")
        }
        composable("TargetVol") {
            target(navController = navController, "")
        }
        composable("next_page/{buttonText}", arguments = listOf(navArgument("buttonText") { type = NavType.StringType })) { navBackStackEntry ->
            val buttonText = navBackStackEntry.arguments?.getString("buttonText") ?: ""
            // Use the buttonText to determine which button was clicked, and display the appropriate content
            Details()
        }
        composable("Approved Attendance"){
            ApprovedList(approvedNames = ApprovedList)
        }
        composable("Disapproved Attendance"){
            DisapprovedList(disapprovedNames = DisApprovedList)
        }
        composable("LogOut"){
            NextScreen(navController = navController)
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


@Composable
fun LogOut(navController: NavController) {
    Button(
        onClick = { navController.navigate("LogOut") },
        modifier = Modifier
            .border(2.dp, color = SpanColor, shape = RoundedCornerShape(20.dp)),
        colors = ButtonDefaults.buttonColors(Background)

    ) {
        Text(
            text = "Log Out",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = SpanColor,
            modifier = Modifier.padding(8.dp) // Add padding for better appearance
        )
    }
}

