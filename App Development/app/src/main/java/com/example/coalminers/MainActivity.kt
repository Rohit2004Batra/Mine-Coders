package com.example.coalminers

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.coalminers.ui.theme.CoalMinersTheme
import kotlinx.coroutines.launch
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoalMinersTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    coalMiners()
                }
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun coalMiners(){
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerstate = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerstate,
        gesturesEnabled = true ,
        drawerContent = {
            ModalDrawerSheet {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black),
                    Alignment.Center
                ) {
                    Column {
                        Text(text = "Welcome!", color = Color.White, fontWeight = Bold, fontSize = 20.sp)
                        Text(text = "UserName", color = Color.White, fontWeight = FontWeight.Light, fontStyle = FontStyle.Italic, fontSize = 12.sp)
                    }
                }
                HorizontalDivider()
                LazyColumn {
                    item {
                        Column (modifier = Modifier.fillMaxSize()){
                            NavigationDrawerItem(
                                label = { Text(text = "Home") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Home.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Awareness") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Awareness.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Emergency") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Emergency.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Measures") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Measures.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Equipments") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Equipments.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Management") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.Management.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "R & D of mines") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.RSD_of_mines.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            NavigationDrawerItem(
                                label = { Text(text = "Analytics & Rating") },
                                selected = false,
                                onClick = {
                                    coroutineScope.launch {
                                        drawerstate.close()
                                    }
                                    navigationController.navigate(Screens.AnalyticsSRating.screens) {
                                        popUpTo(0)
                                    }
                                }
                            )
                            Row(modifier = Modifier
                                .fillMaxWidth(),
                                verticalAlignment = Alignment.Bottom,
                                horizontalArrangement = Arrangement.Center){
                                LottieExample()
                            }
                        }
                    }
                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                val coroutineScope = rememberCoroutineScope()
                TopAppBar(title = { Text(text = "Coal miners") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Black,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch{
                                drawerstate.open()
                            }
                        }) {
                            Icon(
                                Icons.Rounded.Menu , contentDescription = "Menu"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {
                            navigationController.navigate(Screens.Profile.screens) {
                                popUpTo(0)
                            }
                        }) {
                            Icon(Icons.Default.Person, tint = Color.White, contentDescription = "Profile")
                        }
                    }
                )
            }
        ) {
            NavHost(navController = navigationController,
                startDestination = Screens.Home.screens){
                composable(Screens.Home.screens){ Home() }
                composable(Screens.Awareness.screens){ Awareness() }
                composable(Screens.Emergency.screens){ Emergency() }
                composable(Screens.Measures.screens){ Measures() }
                composable(Screens.Equipments.screens){ Equipments() }
                composable(Screens.Management.screens){ Management() }
                composable(Screens.RSD_of_mines.screens){ RSD_of_mines() }
                composable(Screens.Profile.screens){ Profile() }
                composable(Screens.AnalyticsSRating.screens){ AnalyticsSRating() }
            }
        }
    }
}
@Composable
fun LottieExample() {

    // to keep track if the animation is playing
    // and play pause accordingly
    var isPlaying by remember {
        mutableStateOf(true)
    }
    // for speed
    var speed by remember {
        mutableStateOf(2f)
    }

    // remember lottie composition ,which
    // accepts the lottie composition result
    val composition by rememberLottieComposition(
        LottieCompositionSpec
            .RawRes(R.raw.truck)
    )


    // to control the animation
    val progress by animateLottieCompositionAsState(
        // pass the composition created above
        composition,

        // Iterates Forever
        iterations = LottieConstants.IterateForever,

        // pass isPlaying we created above,
        // changing isPlaying will recompose
        // Lottie and pause/play
        isPlaying = isPlaying,

        // pass speed we created above,
        // changing speed will increase Lottie
        speed = speed,

        // this makes animation to restart when paused and play
        // pass false to continue the animation at which it was paused
        restartOnPlay = false

    )

    // Column Composable
    Column(
        Modifier
            .background(Color.Transparent)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(
            composition,
            progress,
            modifier = Modifier.size(300.dp).fillMaxWidth()
        )
    }
}