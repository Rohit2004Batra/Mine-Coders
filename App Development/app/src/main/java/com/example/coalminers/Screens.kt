package com.example.coalminers

sealed class Screens(val screens:String){
    data object Home: Screens("home")
    data object Awareness: Screens("Awareness")
    data object Emergency: Screens("Emergency")
    data object Measures: Screens("Measures")
    data object Equipments: Screens("Equipments")
    data object Management: Screens("Management")
    data object RSD_of_mines: Screens("RSD_of_mines")
    data object Profile: Screens("Profile")
    data object AnalyticsSRating: Screens("AnalyticsSRating")
    data object Feedback: Screens("Feedback")
    data object ContactUs: Screens("ContactUs")
    data object Disclamir: Screens("Disclamir")
    data object Help: Screens("Help")
    data object AppPolicies: Screens("AppPolicies")
}