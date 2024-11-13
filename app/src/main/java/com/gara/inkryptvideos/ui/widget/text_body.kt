package com.gara.inkryptvideos.ui.widget

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.gara.inkryptvideos.ui.theme.MyTypography

@Composable
fun Body(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        color = Color.White,
        style = MyTypography.bodyMedium
    )
}