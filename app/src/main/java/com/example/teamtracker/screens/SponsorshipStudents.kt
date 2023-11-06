import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.teamtracker.R
import com.example.teamtracker.components.des
import com.example.teamtracker.components.names
import com.example.teamtracker.screens.CustomTransparentButton
import com.example.teamtracker.screens.atend
import com.example.teamtracker.screens.choice
import com.example.teamtracker.screens.commonbox2
import com.example.teamtracker.screens.cross

@Composable
fun SponStud(navController: NavController)
{
    commonbox2(value = "SPONSORSHIPS DETAILS") {
        LazyColumn(
            content = {
                items(names.size) { index ->
                    CustomListButton(names[index]) {
                        navController.navigate("next_page/${it}")
                    }
                }

            }
        )

    }
}

@Composable
fun CustomListButton(text: String, onClick: (String) -> Unit) {
    Box(
        modifier = Modifier
            .clickable {  onClick(text) }
            .width(375.dp)
            .padding(top = 10.dp)
            .height(66.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFD9D9D9))
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector),
                contentDescription = "",
                modifier = Modifier
                    .size(41.dp)
            )
            Text(
                text = text,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                ),
                modifier = Modifier.padding(start = 50.dp)
            )
        }
    }

    Spacer(modifier = Modifier.height(5.dp))
}


