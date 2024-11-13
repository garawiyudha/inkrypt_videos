package com.gara.inkryptvideos.ui.pages

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.data.getMenuItems
import com.gara.inkryptvideos.ui.theme.InkryptVideosTheme
import com.gara.inkryptvideos.ui.widget.CardInfoItem
import com.gara.inkryptvideos.ui.widget.Title

class InfoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // For dark (black) colors
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                android.graphics.Color.TRANSPARENT,
            )
        )
        // For light (white) colors
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            InkryptVideosTheme {
                // Box allows stacking of composables
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(color = Color.Black)
                ) {
                    // Set the image as the background in the Box
                    Image(
                        painter = painterResource(id = R.drawable.bg_image),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier.fillMaxSize() // This makes the image fill the entire space
                    )

                    MenuList()
                }
            }
        }
    }

    @Composable
    fun MenuList() {
        val item = getMenuItems()
        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 40.dp, horizontal = 12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Title(
                    text = "Unlock Secure Streaming"
                )
            }
            item {
                Box(modifier = Modifier.height(24.dp))
            }
            items(item) {
                val intent = Intent(this@InfoActivity, DetailActivity::class.java)
                intent.putExtra("title", it.name)
                CardInfoItem(it.name, it.icon) { startActivity(intent) }
            }
        }
    }
}