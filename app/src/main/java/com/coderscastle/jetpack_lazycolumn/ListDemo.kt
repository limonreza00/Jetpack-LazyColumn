package com.coderscastle.jetpack_lazycolumn

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListDemo (){

    var scrollState = rememberScrollState()

    Column (
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(top=50.dp)
    )
    {

        for (i in 1..100){
            SimpleDesign()
        }
    }
}

@Composable
fun SimpleDesign(){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp),
        colors = CardDefaults.cardColors(Color.LightGray),){

        Row (modifier = Modifier.padding(top=5.dp)){

            Image(
                imageVector = Icons.Default.Person,
                contentDescription = "person",
                modifier = Modifier
                    .padding(10.dp)
                    .size(100.dp,100.dp)
                    .clip(CircleShape).
                    background(Color.White),
                contentScale = ContentScale.Crop
                    )

            Column(modifier = Modifier.padding(top=10.dp, start = 10.dp)) {
                Text(
                    text = "Tony Stark",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Text(text = "I am Tony Stark the founder of Stark Industries")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ListDemo()
}