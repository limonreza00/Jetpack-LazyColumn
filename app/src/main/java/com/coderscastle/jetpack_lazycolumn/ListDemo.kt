package com.coderscastle.jetpack_lazycolumn

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListDemo (){

    val myList = getComicsCharacterData()

    LazyColumn (content = {
        itemsIndexed(myList, itemContent = {index,item->
            SimpleDesign(item = item)

        })
    }, modifier = Modifier.padding(top=30.dp))

}


@Composable
fun SimpleDesign(item : ComicsCharacterData){
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp)
            .clickable(onClick = { Toast.makeText(context, "I am ${item.name}", Toast.LENGTH_SHORT).show()}),
        colors = CardDefaults.cardColors(Color.LightGray),){

        Row (modifier = Modifier.padding(top=5.dp)){

         Image(
             painter = painterResource(item.image),
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
                    text = item.name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Text(text = item.desc)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
}