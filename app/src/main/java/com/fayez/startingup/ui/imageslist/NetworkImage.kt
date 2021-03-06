package com.fayez.startingup.ui.imageslist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.fayez.startingup.R


@OptIn(ExperimentalCoilApi::class)
@Composable
fun NetworkImage (
    url : String,
contentDesc: String?,
    modifier: Modifier
){
    Box(modifier ){
        val painter = rememberImagePainter(
            data = url,
            builder = {
                placeholder(drawableResId = R.drawable.fayez)
                crossfade(true)
            }
        )

        Image(painter = painter,
            contentDescription = contentDesc,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
        )
    }
}