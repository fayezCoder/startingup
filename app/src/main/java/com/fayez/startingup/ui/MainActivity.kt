package com.fayez.startingup.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.toArgb
import com.fayez.startingup.ui.imageslist.ImagesScreen
import com.fayez.startingup.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {   //this code to bring my theme
                window.statusBarColor =
                    MaterialTheme.colors.primaryVariant.toArgb()
                ImagesScreen()
            }
        }
    }
}





