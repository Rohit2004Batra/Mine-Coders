package com.example.coalminers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Feedback(){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, top = 90.dp, bottom = 5.dp, end = 5.dp)
        .paint(
            painterResource(id = R.drawable.indian), contentScale = ContentScale.Crop, alpha = 0.4f)) {
        item {
            Text(text = "Feedback")
        }
    }
}