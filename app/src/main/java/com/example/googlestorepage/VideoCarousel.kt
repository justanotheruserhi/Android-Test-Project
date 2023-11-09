package com.example.googlestorepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VideoCarousel(previews: List<Painter>) {
    Row (
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier
            .padding(start = 24.dp)
            .horizontalScroll(state = ScrollState(0))
    ) {
        for (painter in previews) {
            Image(
                painter = painter,
                contentDescription = "preview",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(240.dp)
                    .height(135.dp)
                    .clip(RoundedCornerShape(16.dp)
                    )
            )
        }
    }
}

@Composable
@Preview
fun VideoCarouselShow() {
    VideoCarousel(
        listOf(
            painterResource(id = R.drawable.image_18),
            painterResource(id = R.drawable.image_19)
        )
    )
}
