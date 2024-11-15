package com.gara.inkryptvideos.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_image),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        alignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxWidth().offset(y = (-5).dp)
    )
}