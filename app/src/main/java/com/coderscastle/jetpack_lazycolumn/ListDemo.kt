package com.coderscastle.jetpack_lazycolumn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ListDemo (){

    var scrollState = rememberScrollState()

    Column (
        modifier = Modifier.verticalScroll(scrollState)
    )
    {

        for (i in 1..100){

            Text(text = "Item $i")

        }
    }
}