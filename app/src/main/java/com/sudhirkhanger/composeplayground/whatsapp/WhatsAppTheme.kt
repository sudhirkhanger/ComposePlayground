package com.sudhirkhanger.composeplayground.whatsapp

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.sudhirkhanger.composeplayground.ui.theme.*

private val DarkColorPalette = darkColors(
    primary = waPrimaryDark,
    primaryVariant = waPrimaryDark,
    secondary = waPrimaryDark,
    background = waBackgroundDark,
    surface = waBackgroundDark
)

private val LightColorPalette = lightColors(
    primary = waPrimaryLight,
    primaryVariant = waPrimaryLight,
    secondary = waPrimaryLight

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun WhatsAppTheme(
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
