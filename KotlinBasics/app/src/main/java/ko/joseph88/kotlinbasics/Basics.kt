package ko.joseph88.kotlinbasics

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(text:String){
    Text(
        text = text,
        style = TextStyle(
            fontSize = 20.sp,
            color = Color.Green))
}

@Composable
fun MyApp(){
    Column {
        CustomText(text = "Hello")
        CustomText(text = "What's going on")
        Text("asd")
    }
}