package com.example.googlestorepage

import androidx.compose.ui.graphics.painter.Painter

data class CommentBase(
    val author: String,
    val text: String,
    val date: String,
    val avatar: Painter
)