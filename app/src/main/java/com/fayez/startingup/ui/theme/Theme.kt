package com.fayez.startingup.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFFA3A6AC),
    primaryVariant = Color(0xFF3F4761),
    secondary = Teal200,)

private val LightColorPalette = lightColors(
    primary = Color(0xFFAAAAAC),
    primaryVariant = Color(0xFF6C6D6F),
    secondary = Teal200,
    // onPrimary = Color.Black

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    ,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}