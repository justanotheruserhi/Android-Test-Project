package com.example.googlestorepage

import android.R.attr.width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlestorepage.ui.theme.GoogleStorePageTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleStorePageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen("Fish");
                }
            }
        }
    }
}

@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {
    val defaultBackgroundColor = Color(0xFF050B18)
    LazyColumn(
        modifier = Modifier
            .background(color = defaultBackgroundColor)
    ) {
        item {
            //banner
            Image(painter = painterResource(id = R.drawable.image_16),
                contentDescription = "Banner",
                contentScale = ContentScale.FillWidth,
                alignment = Alignment.BottomCenter,
                modifier = Modifier
                    .fillMaxWidth())
        }
        item {
            //logo
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .offset(21.dp, -30.dp)
                    .size(88.dp)
                    .clip(RoundedCornerShape(13.54.dp))
                    .border(
                        width = 2.dp,
                        shape = RoundedCornerShape(12.57.dp),
                        color = Color(0xFF1F2430)
                    )
                    .background(color = Color.Black))
            {
                Image(painter = painterResource(id = R.drawable.image_17),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(54.dp))
            }
        }
        item {
            Text (
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xB2EEF2FB),
                ),
                modifier = Modifier
                    .width(327.dp)
                    .height(76.dp)
                    .padding(start = 24.dp, bottom = 43.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenPreview() {
    GoogleStorePageTheme {
        Screen("Android")
    }
}