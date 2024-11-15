package com.gara.inkryptvideos.ui.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.MyTypography
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardInfoItem(name: String, icon: Painter, onClick: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1B1C36).copy(alpha = 0.2f),
            contentColor = Color(0xFF1B1C36)
        ), border = BorderStroke(
            width = 1.sdp, brush = Brush.horizontalGradient(
                colors = listOf(Color(0x332ECFF2), Color(0x4DA33EFB)),  // Adjust colors as needed
            )
        ), modifier = Modifier
            .padding(horizontal = 4.sdp, vertical = 10.sdp)
            .fillMaxWidth(), onClick = onClick,
        shape = RoundedCornerShape(30.sdp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                style = MyTypography.bodyLarge.copy(fontSize = 13.ssp),
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.menu_item_bg),
                    contentDescription = "",
                    modifier = Modifier.width(150.sdp).height(125.sdp).alpha(0.85f),
                )
                Image(
                    painter = icon, contentDescription = "", modifier = Modifier.size(75.sdp).alpha(0.95f)
                )
            }
        }

    }
}