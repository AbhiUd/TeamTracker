package com.example.teamtracker.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.example.teamtracker.components.PageIcon
import com.example.teamtracker.components.des
import com.example.teamtracker.components.names




var ApprovedList = listOf<String>()
var DisApprovedList = listOf<String>()
@Composable
fun approval(navController: NavController) {
    val approvedNames = remember { mutableStateListOf<String>() }
    val disapprovedNames = remember { mutableStateListOf<String>() }



    Column(horizontalAlignment = Alignment.Start) {

        TTLogo()
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Heading(name = "ATTENDANCE APPROVAL")

        Spacer(modifier = Modifier.height(10.dp))

        PageIcon(painterResource = painterResource(id = R.drawable.attendance))
        
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .height(530.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA)
                ) ){
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LazyColumn(
                            content = {
                                items(names.size) { index ->
                                    choice(name = names[index]
                                        , description = des[index]
                                        , approvedNames = approvedNames,
                                        disapprovedNames = disapprovedNames)
                                }
                            }
                        )

                    }
                }
//        ApprovedList(approvedNames)
//        DisapprovedList(disapprovedNames)
        ApprovedList=approvedNames
        DisApprovedList =disapprovedNames
    }


}

@Composable
fun Sponsorship_details(navController: NavController) {
    Column(horizontalAlignment = Alignment.Start) {


        TTLogo()
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Heading(name = "SPONSORSHIP DETAILS")

        Spacer(modifier = Modifier.height(10.dp))

        PageIcon(painterResource = painterResource(id = R.drawable.sponsorshipcyan))
        
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .height(530.dp)
                .width(380.dp)
                .background(
                    color = Color(0xFFBCBEFA)
                ) ){

        }
    }
}



@Composable
fun Heading(name: String){
    Text(
        text = name,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        ),
        color = Color(0xFFAFF6FF),
        modifier = Modifier.padding(top = 135.dp)
    )
}


@Composable
fun CustomTransparentButton(
    name: String,
    description: String,
    content: @Composable (isVisible: Boolean) -> Unit
) {
    var isVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .clickable { isVisible = !isVisible }
    ) {
        content(isVisible)
    }

    BoxWithConstraints {
        val maxWidth = maxWidth
        if (isVisible) {
            Box(
                modifier = Modifier
                    .width(maxWidth) // Width expands to maxWidth
                    .height(IntrinsicSize.Min), // Height varies based on content
                contentAlignment = Alignment.TopStart
            ) {
                Text(
                    text = description,
                    style = TextStyle(
                        fontSize = 25.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Composable
fun choice(name: String, description: String, approvedNames: MutableList<String>,disapprovedNames: MutableList<String>) {
    CustomTransparentButton(name = name, description = description) { isVisible ->
        Box(
            modifier = Modifier
                .width(375.dp)
                //.padding(start = 10.dp, end = 10.dp)
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
                    text = name,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    ),
                    modifier = Modifier.padding(start = 16.dp)
                )

            }
            Row (Modifier.offset(250.dp)) {
                atend(onClickListener = { approvedNames.add(name) })
                Spacer(modifier = Modifier.width(8.dp))
                cross(onClickListener = { disapprovedNames.add(name) })
            }

        }
    }
    Spacer(modifier = Modifier.height(5.dp))
}


@Composable
fun atend(
    onClickListener:()->Unit,
    modifier: Modifier = Modifier){
    Box(modifier = modifier
        .clip(RoundedCornerShape(5.dp))
        .background(Color.Transparent)
        .clickable { onClickListener() }
    )
    {
        Image(
            painter = painterResource(id = R.drawable.tick),
            contentDescription = "",
            modifier = Modifier
                .size(41.dp)
        )
    }
}


@Composable
fun cross(onClickListener:()->Unit ,
          modifier: Modifier = Modifier){
    Box(modifier = modifier
        .clip(RoundedCornerShape(5.dp))
        .background(Color.Transparent)
        .clickable { onClickListener() }
    )
    {
        Image(
            painter = painterResource(id = R.drawable.cross),
            contentDescription = "",
            modifier = Modifier
                .size(41.dp)
        )
    }
}

