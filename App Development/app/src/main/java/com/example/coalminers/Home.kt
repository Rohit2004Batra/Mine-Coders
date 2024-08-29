package com.example.coalminers


import android.R.attr.start
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay


@OptIn(ExperimentalPagerApi::class)
@Composable
fun Home(){
    val navigationController = rememberNavController()
    val images = listOf(
        R.drawable.coal1,
        R.drawable.coal2,
        R.drawable.coal3,
        R.drawable.coal4)


    val pagerState = rememberPagerState(pageCount = images.size)
    LaunchedEffect(Unit) {
        while(true){
            delay(5000)
            val nextPage = (pagerState.pageCount + pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.scrollToPage(nextPage)
        }
    }
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.indian), contentScale = ContentScale.Crop, alpha = 0.4f)
    ) {
        item {
                Box(modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 5.dp, top = 90.dp, bottom = 5.dp, end = 5.dp)){
                    Column(modifier = Modifier.align(Alignment.Center)) {
                        Box(modifier = Modifier.fillMaxSize(), Alignment.Center){
                            Text(text = "Home", color = Color.White)
                        }
                        com.google.accompanist.pager.HorizontalPager(
                            state = pagerState,
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(start = 26.dp, top = 15.dp, end = 26.dp, bottom = 5.dp)) {currentPage ->
                            Card(
                                modifier = Modifier.wrapContentSize(),
                                elevation = CardDefaults.cardElevation(8.dp)
                            ) {
                                Image(painter = painterResource(id = images[currentPage]), contentDescription = null)
                            }
                        }
                        Box(modifier = Modifier.fillMaxSize(), Alignment.Center){
                            PageIndicator(
                                pageCount = images.size,
                                currentPage = pagerState.currentPage
                            )
                        }
                    }
                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Introduction", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                    Text(text = "Coal is mined commercially in over 50 countries. 7,921 million metric tons (Mt) of coal were produced in 2019, a 70% increase over the 20 years since 1999.\n" +
                            "Coal in India has been mined since 1774, and India is the second largest producer and consumer of coal after China.\n" + "\n" +
                            "Raniganj was the very first coalfield in India where coal mining started during the East India Company i.e. in the year 1774.Dhanbad is one of the oldest coal mines in Jharkhand. It is also the richest coalfield of India. It is known as the storehouse of the best metallurgical coal which is coking coal.\n" +
                            "The chief producing districts of the country are Darjeeling and Jalpaiguri.\n", color = Color.White)
                    Text(text = "Categories", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
                    Text(text = "The two main categories of distribution of coal mines\n" +
                            "a)The Gondwana Coalfields\n" +
                            "Makes up 98% of the total coal reserves and 99% of the coal production in India. Coal from here is free from moisture and contains phosphorus and sulfur. \n" + "\n" +
                            "b)Tertiary Coal Fields-\n" +
                            "Carbon content is very low but is rich in moisture and sulphur.\n" +
                            "Tertiary coalfields are mainly confined to extra-peninsular regions", color = Color.White)
                }

            Box(modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))){
                Column(modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Row (modifier = Modifier
                        .fillMaxWidth()){
                        Text(text = "App Policies", fontSize = 12.sp, color = Color.White,  modifier = Modifier
//                            .padding(16.dp)
//                            .clickable { navigationController.navigate(Screens.AppPolicies.screens) {
//                                popUpTo(0)
//                            } }
                        )
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "|", color = Color.White)
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "Help", fontSize = 12.sp, color = Color.White,  modifier = Modifier
//                            .padding(16.dp)
//                            .clickable { navigationController.navigate(Screens.Help.screens) {
//                                popUpTo(0)
//                            } }
                        )
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "|", color = Color.White)
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "Disclamir", fontSize = 12.sp, color = Color.White,  modifier = Modifier
//                            .padding(16.dp)
//                            .clickable { navigationController.navigate(Screens.Disclamir.screens) {
//                                popUpTo(0)
//                            } }
                        )
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "|", color = Color.White)
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "ContactUs", fontSize = 12.sp, color = Color.White,  modifier = Modifier
//                            .padding(16.dp)
//                            .clickable { navigationController.navigate(Screens.ContactUs.screens) {
//                                popUpTo(0)
//                            } }
                        )
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "|", color = Color.White)
                        Spacer(Modifier.weight(1f, true))
                        Text(text = "Feedback", fontSize = 12.sp, color = Color.White,  modifier = Modifier
//                            .padding(16.dp)
//                            .clickable { navigationController.navigate(Screens.Feedback.screens) {
//                                popUpTo(0)
//                            } }
                        )
                    }
                    Row {
                        Image(painter = painterResource(id = R.drawable.facebook), contentDescription = null, Modifier.size(10.dp))
                        Spacer(Modifier.width(5.dp))
                        Image(painter = painterResource(id = R.drawable.twitter), contentDescription = null, Modifier.size(10.dp))
                        Spacer(Modifier.width(5.dp))
                        Image(painter = painterResource(id = R.drawable.insta), contentDescription = null, Modifier.size(10.dp))
                        Spacer(Modifier.width(5.dp))
                        Image(painter = painterResource(id = R.drawable.youtube), contentDescription = null, Modifier.size(10.dp))

                    }
                    Text(text = "(c) 2024 Ministry of Coal. All rights reserved.", fontSize = 8.sp, color = Color.White)
                }
//                NavHost(navController = navigationController,
//                    startDestination = Screens.AppPolicies.screens){
//                    composable(Screens.Home.screens){ Home() }
//                    composable(Screens.AppPolicies.screens){ AppPolicies() }
//                    composable(Screens.Help.screens){ Help() }
//                    composable(Screens.Disclamir.screens){ Disclamir() }
//                    composable(Screens.ContactUs.screens){ ContactUs() }
//                    composable(Screens.Feedback.screens){ Feedback() }
//                }
            }
        }

    }
}


@Composable
fun PageIndicator(pageCount: Int, currentPage: Int) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
    ){
        repeat(pageCount){
            IndicatorDots(isSelected = it == currentPage)
        }
    }
}

@Composable
fun IndicatorDots(isSelected: Boolean) {
    val size = animateDpAsState(targetValue = if(isSelected) 12.dp else 10.dp, label = "ImageIndicator")
    Box(modifier = Modifier
        .padding(2.dp)
        .size(size.value)
        .clip(CircleShape)
        .background(if (isSelected) Color(0x6F8B8B8B) else Color(0xFF858585)))
}

