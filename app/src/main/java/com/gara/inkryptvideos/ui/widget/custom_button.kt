package com.gara.inkryptvideos.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.MyCustomFontFamily
import com.gara.inkryptvideos.ui.theme.MyTypography
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    buttonColor: Color = Color.Transparent,
    borderColor: Color = Color(0xFFBFA2E5),
) {
    Row(
        modifier = modifier
            .clickable(onClick = onClick)
            .background(buttonColor, shape = RoundedCornerShape(50))
            .border(1.sdp, borderColor, shape = RoundedCornerShape(50))
            .padding(horizontal = 24.sdp, vertical = 12.sdp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = textColor,
            fontFamily = MyCustomFontFamily,
            style = MyTypography.bodyLarge.copy(fontSize = 12.ssp),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(end = 8.dp)
        )
        Box(modifier = Modifier.width(12.sdp))
        Image(
            painter = painterResource(id = R.drawable.arrow_up_right),
            contentDescription = null,
            modifier = Modifier.size(18.sdp) // This makes the image fill the entire space
        )
    }
}
