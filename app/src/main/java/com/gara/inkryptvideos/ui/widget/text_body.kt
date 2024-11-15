package com.gara.inkryptvideos.ui.widget

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.gara.inkryptvideos.ui.theme.MyTypography
import network.chaintech.sdpcomposemultiplatform.ssp

@Composable
fun Body(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        color = Color.White,
        style = MyTypography.bodyMedium.copy(fontSize = 12.ssp)
    )
}