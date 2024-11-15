package com.gara.inkryptvideos.ui.widget

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.ui.theme.MyCustomFontFamily
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBar(title: String, isHome: Boolean, onBackPressed: () -> Unit) {

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            titleContentColor = Color.White,
        ),
        title = {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontFamily = MyCustomFontFamily,
                fontSize = 14.ssp,
                modifier = Modifier.padding(start = 14.dp)
            )
        },
        navigationIcon = {
            if (!isHome){
                IconButton(onClick = onBackPressed) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White,
                        modifier = Modifier.size(14.sdp)
                    )
                }
            }
        }
    )
}