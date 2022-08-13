package com.kaankesan.foodrecipes.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val yellow = Color(0xFFFFD54F)
val red = Color(0xFFD50000)

@Composable
fun contentColor():Color{
    return if(isSystemInDarkTheme()){
        Color.White
    }else{
        Color.Black
    }
}