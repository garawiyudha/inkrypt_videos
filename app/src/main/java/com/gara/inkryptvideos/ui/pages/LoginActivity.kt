package com.gara.inkryptvideos.ui.pages

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.widget.CustomButton
import com.gara.inkryptvideos.ui.theme.InkryptVideosTheme
import com.gara.inkryptvideos.ui.theme.MyTypography
import com.gara.inkryptvideos.ui.widget.StyledWelcomeText
import com.gara.inkryptvideos.ui.widget.Subtitle
import com.gara.inkryptvideos.ui.widget.Title
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : ComponentActivity() {
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
                Box(modifier = Modifier.fillMaxSize()) {
                    // Set the image as the background in the Box
                    Image(
                        painter = painterResource(id = R.drawable.bg_image),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier.fillMaxSize() // This makes the image fill the entire space
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        StyledWelcomeText()
                        Box(modifier = Modifier.height(18.dp))
                        Subtitle(text = "Ensure your privacy and keep\n your content safe and secure.")
                        Image(
                            painter = painterResource(id = R.drawable.app_logo),
                            contentDescription = null,
                            modifier = Modifier
                        )
                        CustomButton(text = "Get More Information", onClick = {
                            startActivity(Intent(this@LoginActivity, InfoActivity::class.java))
                        })
                    }
                    // Your content goes here
                }
            }
        }
    }
}



