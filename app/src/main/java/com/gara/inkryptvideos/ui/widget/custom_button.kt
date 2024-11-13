package com.gara.inkryptvideos.ui.widget

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.MyCustomFontFamily
import com.gara.inkryptvideos.ui.theme.MyTypography

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.White,
    buttonColor: Color = Color.Transparent,
    borderColor: Color = Color(0xFFBFA2E5),
) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .background(buttonColor, shape = RoundedCornerShape(50))
            .border(1.dp, borderColor, shape = RoundedCornerShape(50))
            .padding(horizontal = 24.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = textColor,
            fontFamily = MyCustomFontFamily,
            style = MyTypography.bodyLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(end = 8.dp)
        )
        Box(modifier = Modifier.width(12.dp))
        Image(
            painter = painterResource(id = R.drawable.arrow_up_right),
            contentDescription = null,
            modifier = Modifier.size(32.dp) // This makes the image fill the entire space
        )
    }
}
