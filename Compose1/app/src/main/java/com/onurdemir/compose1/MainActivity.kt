package com.onurdemir.compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.onurdemir.compose1.ui.theme.Compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
   Column(
       modifier = Modifier
           .fillMaxSize()
           .background(Color.LightGray),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally




   ) {

       CustomText(text = "Hello Android!")
       Spacer(modifier = Modifier.padding(10.dp))
       CustomText(text = "Hello World!")
       Spacer(modifier = Modifier.padding(10.dp))
       CustomText(text = "Hello Kotlin!")
       Spacer(modifier = Modifier.padding(10.dp))

       Row(
           modifier = Modifier.fillMaxWidth(),
           horizontalArrangement = Arrangement.Center,
           verticalAlignment = Alignment.CenterVertically

       ) {
           CustomText(text = "TEST 1")
           Spacer(modifier = Modifier.padding(10.dp))
           CustomText(text = "TEST 2")
           Spacer(modifier = Modifier.padding(10.dp))
           CustomText(text = "TEST 3")
       }
   }
}

@Composable
fun CustomText(text : String) {
    Text(
        text = text,
        modifier = Modifier
            .clickable {
                println("clicked")
            }
            .background(color = Color.Gray)
            .padding(start = 10.dp, end = 10.dp, top = 20.dp, bottom = 20.dp)

            //.fillMaxSize(0.5f)
            //.width(200.dp)

        ,color = Color.White,
        fontSize = 25.sp,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Center
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}