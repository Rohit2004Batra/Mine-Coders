package com.example.coalminers

import android.graphics.drawable.shapes.Shape
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun RSD_of_mines(){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(start = 5.dp, top = 90.dp, bottom = 5.dp, end = 5.dp)
        .paint(
        painterResource(id = R.drawable.indian), contentScale = ContentScale.Crop, alpha = 0.4f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            ExpandableCard(
                title = "Kapurdi Lignite",
                content = "Kapurdi Lignite Block is situated at 18.5 km North of Barmer Town on National Highway – 15 in the district of Barmer. " +
                        "Indo-Pak International Border is at a distance of about 120km west of the block. " +
                        "The entire mining lease area of Kapurdi block lies in great Indian desert of Thar. " +
                        "Most of the lands are unirrigated agricultural land and there is no forest land involved. " +
                        "There are no national parks, wildlife sanctuary and biosphere reserves."
            )
            ExpandableCard(
                title = "Jalipa Lignite",
                content = "Jalipa Lignite Block is situated at 10.5 km north of Barmer Town on National Highway – 15 in the district of Barmer. " +
                        "Indo-Pak International Border is at a distance of about 120 km West of the block. " +
                        "There are no national parks, wildlife sanctuary and biosphere reserves."
            )
            ExpandableCard(
                title = "Matasukh-Kasnau",
                content = "Matasukh-Kasnau  mines are situated near villages Kasnau & Matasukh  of Nagaur district in the central Rajasthan, which is 42 Km from district head quarter. " +
                        "The commercial production of Lignite  from these mines, was commenced from November 2003 with envisaged  capacity  of 12,00,000 MT per  year."
            )
            ExpandableCard(
                title = "Jhamarkotra & Kanpur Group of Mines",
                content = "Jhamarkotra & Kanpur Group of Mines- Rock Phosphate mines at Jhamarkotra & Kanpur Group of Mines are complex deposits. " +
                        "Mining these rock phosphate deposits is far more difficult than that in most parts of the world. " +
                        "The open pit mining method is being followed at Jhamarkotra Mine  for exploitation of the mineral."
            )
            ExpandableCard(
                title = "SANU LIMESTONE UNIT",
                content = "SANU LIMESTONE UNIT, JAISLAMER\n" +
                        "his high grade, low silica, hard compact limestone is available in Khuiyala formation of Eocene age of Tertiary period. " +
                        "Open cast mining method with single bench, deploying HEMM and conducting deep hole blasting is in practice."
            )
        }
    }
}
@Composable
fun ExpandableCard(title: String, content: String) {
    // State to track if the card is expanded or collapsed
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { expanded = !expanded } // Toggle the expanded state on click
            .animateContentSize(), // Animate the content size when expanded/collapsed
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE0F7FA)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Title
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            // Expanded content
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = content,
                    color = Color.Black
                )
            }
        }
    }
}

