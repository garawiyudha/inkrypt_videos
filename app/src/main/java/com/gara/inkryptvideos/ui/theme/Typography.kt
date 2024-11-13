package com.gara.inkryptvideos.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val MyTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = MyCustomFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = MyCustomFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = MyCustomFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    // Add other styles as needed
)