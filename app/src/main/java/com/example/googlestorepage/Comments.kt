package com.example.googlestorepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlestorepage.CommentBase
import com.example.googlestorepage.ui.theme.WhiteMod

@Composable
fun Comments(comment: CommentBase, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        CommentAuthor(comment)
        Spacer(modifier = Modifier.height(17.dp))
        Text(
            text = comment.text,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(400),
                color = WhiteMod,
                letterSpacing = 0.5.sp,
            )
        )
    }
}

@Composable
private fun CommentAuthor(comment: CommentBase) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = comment.avatar,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape),
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
        ) {
            Text(
                text = comment.author,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Color.White,
                    letterSpacing = 0.5.sp,
                ),
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = comment.date,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = WhiteMod,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}

@Preview
@Composable
fun CommentsPreview() {
    CommentBase("Auguste Conte",
        "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
        "February 14, 2019",
        painterResource(R.drawable.avatar),)
}
