package com.gara.inkryptvideos.ui.widget

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.MyCustomFontFamily
import com.gara.inkryptvideos.ui.theme.MyTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardInfoItem(name: String, icon: Painter, onClick: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1B1C36).copy(alpha = 0.2f)
        ), border = BorderStroke(
            width = 1.dp, brush = Brush.horizontalGradient(
                colors = listOf(Color(0x332ECFF2), Color(0x4DA33EFB)),  // Adjust colors as needed
            )
        ), modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), onClick = onClick
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                style = MyTypography.bodyLarge,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.menu_item_bg),
                    contentDescription = "",
                    modifier = Modifier.size(200.dp),
                )
                Image(
                    painter = icon, contentDescription = "", modifier = Modifier.size(100.dp)
                )
            }
        }

    }
}