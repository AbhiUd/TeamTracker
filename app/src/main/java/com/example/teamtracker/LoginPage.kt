package com.example.teamtracker




import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teamtracker.logo_page.csiApp
import com.example.teamtracker.ui.theme.*
import com.example.teamtracker.ui.theme.Btnbackground
import com.example.teamtracker.ui.theme.TeamTrackerTheme
import kotlinx.coroutines.delay


@Composable
fun NextScreen() {
    // UI for the next screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo image",
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        CyanText(content = "Who are you?")

        Spacer(modifier = Modifier.height(30.dp))



        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(1f)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(0.5f)
                ) {
                Button(onClick = {}, modifier = Modifier
                    .width(133.dp)
                    .height(133.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Btnbackground),
                    shape = RoundedCornerShape(67),

                ) {
                    Image(painter = painterResource(id = R.drawable.team),
                        contentDescription ="Volunteer",
                        modifier = Modifier
                            .height(67.dp)
                            .width(70.dp)
                    )
                }
                CyanText(content = "Volunteer")

            }
            Spacer(modifier = Modifier.width(20.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Button(onClick = {}, modifier = Modifier
                    .width(133.dp)
                    .height(133.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Btnbackground),
                    shape = RoundedCornerShape(67),

                    ) {
                    Image(painter = painterResource(id = R.drawable.leader),
                        contentDescription ="Lead",
                        modifier = Modifier
                            .height(67.dp)
                            .width(70.dp)
                    )
                }
                CyanText(content = "Lead")

            }

        }



    }
}


@Composable
fun CyanText(content: String){
    Text(text = content,
        style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Cyan
        )
    )

}
