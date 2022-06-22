package com.fayez.startingup.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fayez.startingup.data.domin.ImageData
import com.fayez.startingup.ui.imageslist.NetworkImage

@Composable
fun ImageCard(image: ImageData) {
    Card(
        elevation = 4.dp, shape = MaterialTheme.shapes.small, modifier = Modifier.padding(8.dp)
    ) {
        Box {
            NetworkImage(
                url = image.download_url,
                contentDesc = null,
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = image.author.uppercase(),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(MaterialTheme.colors.primary.copy(alpha = 0.6f))
                    .fillMaxWidth()
                    .padding(4.dp),
                style = MaterialTheme.typography.subtitle2
            )
        }
    }
}