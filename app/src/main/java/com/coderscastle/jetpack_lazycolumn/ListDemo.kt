package com.coderscastle.jetpack_lazycolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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

    val list = listOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
    LazyColumn (content = {
        itemsIndexed(list, itemContent = {index,item->
            SimpleDesign(name = item, desc = "Description $item")

        })
    })

}


@Composable
fun SimpleDesign(name:String,desc:String){

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
                    text = name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Text(text = desc)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ListDemo()
}