package com.gara.inkryptvideos.ui.pages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.InkryptVideosTheme
import com.gara.inkryptvideos.ui.theme.MyTypography
import com.gara.inkryptvideos.ui.widget.Body
import com.gara.inkryptvideos.ui.widget.CustomButton
import com.gara.inkryptvideos.ui.widget.SmallTopAppBar
import com.gara.inkryptvideos.ui.widget.Subtitle
import com.gara.inkryptvideos.ui.widget.Title

class DetailActivity : ComponentActivity() {
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
                android.graphics.Color.TRANSPARENT, android.graphics.Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            InkryptVideosTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    // Background image
                    Image(
                        painter = painterResource(id = R.drawable.bg_image),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier.fillMaxSize() // This makes the image fill the entire space
                    )

                    // Scrollable column for content
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState()), // Enables scrolling
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        val title: String = intent.getStringExtra("title").toString()

                        // Top App Bar
                        Box(modifier = Modifier.height(12.dp))
                        SmallTopAppBar(title, isHome = false, onBackPressed = { finish() })

                        // Image and icon inside a Box
                        Box(contentAlignment = Alignment.Center) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_item_bg),
                                contentDescription = "",
                                modifier = Modifier.size(300.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.about_icon),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }

                        // Additional content (like the video player info widget)
                        VideoPlayerInfoWidget()
                    }
                }
            }
        }

    }

    @Composable
    fun VideoPlayerInfoWidget() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 54.dp),
            verticalArrangement = Arrangement.Top, // Align items to the top
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "App Build Version : 1.4.1",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Body(
                text = "My Video Player is designed to provide high-quality, protected content from our trusted partner video hosts. Whether you’re accessing educational materials, entertainment, or any other exclusive videos, our player ensures a seamless and secure viewing experience.",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Body(
                text = "Our app leverages cutting-edge technology to maintain the integrity and confidentiality of the streamed content, allowing you to enjoy premium videos without worrying about unauthorized access or piracy.",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Body(
                text = "With My Video Player, you get the best of both worlds: top-tier video quality and robust protection.",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Body(
                text = "Discover the future of video streaming with Inkript Videos and enjoy the content you love with peace of mind.",
            )
        }

    }

}

