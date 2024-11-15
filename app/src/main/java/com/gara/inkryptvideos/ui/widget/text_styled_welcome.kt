package com.gara.inkryptvideos.ui.widget

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.gara.inkryptvideos.ui.theme.MyCustomFontFamily
import ir.kaaveh.sdpcompose.ssp

@Composable
fun StyledWelcomeText() {
    // Define reusable SpanStyles for each text style
    val shadowStyle = Shadow(
        color = Color.Black,
        offset = Offset(8f, 6f),
        blurRadius = 12f
    )
    val whiteTextStyle = SpanStyle(
        color = Color.White,
        fontSize = 24.ssp,
        shadow = shadowStyle
    )
    val cyanBoldTextStyle = SpanStyle(
        color = Color.Cyan,
        fontSize = 24.ssp,
        fontWeight = FontWeight.Bold,
        shadow = shadowStyle
    )

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        androidx.compose.material3.Text(
            text = buildAnnotatedString {
                pushStyle(whiteTextStyle)
                append("welcome to\n")
                pushStyle(whiteTextStyle)
                append("my ")
                pop() // End of white style
                pushStyle(cyanBoldTextStyle)
                append("video player.")
                pop() // End of cyan bold style
            },
            color = Color.White,
            fontFamily = MyCustomFontFamily,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}