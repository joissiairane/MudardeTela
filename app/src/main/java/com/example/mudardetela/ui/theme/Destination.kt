package com.example.mudardetela.ui.theme

sealed class Destination(var route:String){
    object ScreenFirst: Destination ("ScreenFirst")
    object ScreenSecond: Destination ("ScreenSecond")
}