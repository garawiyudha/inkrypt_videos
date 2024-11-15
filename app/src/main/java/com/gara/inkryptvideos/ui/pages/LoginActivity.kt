package com.gara.inkryptvideos.ui.pages

import android.content.Intent
import android.content.pm.ActivityInfo
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gara.inkryptvideos.R
import com.gara.inkryptvideos.ui.theme.InkryptVideosTheme
import com.gara.inkryptvideos.ui.widget.BackgroundImage
import com.gara.inkryptvideos.ui.widget.CustomButton
import com.gara.inkryptvideos.ui.widget.StyledWelcomeText
import com.gara.inkryptvideos.ui.widget.Subtitle
import dagger.hilt.android.AndroidEntryPoint
import ir.kaaveh.sdpcompose.sdp

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
                // Use Box for stacking composables
                Box(

                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Black),
                    contentAlignment = Alignment.TopCenter
                ) {
                    // Set the image as the background
                    BackgroundImage()
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .padding(horizontal = 24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = Modifier.weight(1.5f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            StyledWelcomeText()
                            Spacer(modifier = Modifier.height(16.dp))
                            Subtitle(
                                text = "Ensure your privacy and keep\n your content safe and secure.",
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                        }

                        Image(
                            painter = painterResource(id = R.drawable.app_logo),
                            contentDescription = null,
                            modifier = Modifier
                                .weight(1f)
                                .size(110.sdp),
                            alignment = Alignment.TopCenter
                        )
                        Box(
                            modifier = Modifier.weight(1f).padding(bottom = 60.sdp),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            CustomButton(
                                text = "Get More Information",
                                onClick = {
                                    startActivity(
                                        Intent(
                                            this@LoginActivity,
                                            InfoActivity::class.java
                                        )
                                    )
                                },
                            )
                        }
                    }
                }
            }
        }
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}




