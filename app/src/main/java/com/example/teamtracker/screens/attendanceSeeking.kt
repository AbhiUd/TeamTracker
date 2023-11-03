package com.example.teamtracker.screens
import android.app.TimePickerDialog
import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamtracker.R
import com.example.teamtracker.ui.theme.PickerBg
import java.util.*
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext



@Composable
fun showDatePicker(){
    val context = LocalContext.current

    val year: Int
    val month: Int
    val day: Int

    val calendar = Calendar.getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)
    calendar.time = Date()

    val date = remember { mutableStateOf("") }
    val datePickerDialog = DatePickerDialog(
        context,
        {_: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            date.value = "$dayOfMonth/$month/$year"
        }, year, month, day
    )

    Row(
        modifier = Modifier.fillMaxSize()
            .padding(start = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        Text(text = " Date: ", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.width(5.dp))
        Box(modifier = Modifier
            .height(30.dp)
            .width(100.dp)
            .background(color = PickerBg, shape = RoundedCornerShape(8.dp))
            ){
            Text(text = date.value, fontWeight = FontWeight.Bold, fontSize = 18.sp, textAlign = TextAlign.Center)
        }

        Image(
            painter = painterResource(id = R.drawable.calendar),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 10.dp)
                .height(25.dp)
                .width(25.dp)
                .clickable {
                    datePickerDialog.show()
                }

        )
    }

}

@Composable
fun ShowTimePicker(name: String){
    val context = LocalContext.current
    val calendar = Calendar.getInstance()
    val hour = calendar[Calendar.HOUR_OF_DAY]
    val minute = calendar[Calendar.MINUTE]

    val time = remember { mutableStateOf("") }
    val timePickerDialog = TimePickerDialog(
        context,
        {_, hour : Int, minute: Int ->
            time.value = "$hour:$minute"
        }, hour, minute, false
    )

    Row(
        modifier = Modifier.fillMaxSize()
            .padding(start = 20.dp)
            ,
        verticalAlignment = Alignment.CenterVertically,

    ) {

        Text(text = " $name Time : ", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        if (name=="In") {Spacer(modifier = Modifier.width(12.dp))}
        else Spacer(modifier = Modifier.width(5.dp))
        Box(modifier = Modifier
            .height(30.dp)
            .width(75.dp)
            .background(color = PickerBg, shape = RoundedCornerShape(8.dp))
        ){
            Text(text = time.value, fontWeight = FontWeight.Bold, fontSize = 18.sp, textAlign = TextAlign.Center)
        }
        Image(
            painter = painterResource(id = R.drawable.clock),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 10.dp)
                .height(25.dp)
                .width(25.dp)
                .clickable {
                    timePickerDialog.show()
                }

        )



    }


}