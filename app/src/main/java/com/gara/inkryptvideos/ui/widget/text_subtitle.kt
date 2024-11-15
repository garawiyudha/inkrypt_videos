package com.gara.inkryptvideos.ui.widget

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.gara.inkryptvideos.ui.theme.MyTypography
import ir.kaaveh.sdpcompose.ssp

@Composable
fun Subtitle(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        color = Color.White,
        textAlign = TextAlign.Center,
        style = MyTypography.bodyLarge.copy(fontSize = 13.ssp)
    )
}