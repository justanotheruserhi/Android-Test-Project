package com.example.googlestorepage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlestorepage.ui.theme.YellowMod

@Composable
fun InstallButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.height(64.dp)
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(YellowMod)
        )
        {
            Text(text = "Install",
                color = Color.Black)
        }
    }
}


@Composable
@Preview
fun InstallButtonShow() {
    InstallButton(onClick = {},
        Modifier.fillMaxWidth())
}