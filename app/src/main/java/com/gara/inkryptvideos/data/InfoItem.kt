package com.gara.inkryptvideos.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.gara.inkryptvideos.R

data class InfoItem(val name: String, val icon: Painter)

@Composable
fun getMenuItems(): List<InfoItem> {
    return listOf(
        InfoItem("About App", painterResource(id = R.drawable.about_icon)),
        InfoItem("Privacy Policy", painterResource(id = R.drawable.privacy_icon)),
        InfoItem("Terms & Conditions", painterResource(id = R.drawable.term_icon))
    )
}