package com.example.googlestorepage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlestorepage.ui.theme.DarkBlue
import com.example.googlestorepage.ui.theme.DividerColor
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
    val context = LocalContext.current
    val defaultBackgroundColor = DarkBlue
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
            //Text annotation
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
                    .padding(start = 24.dp, bottom = 43.dp)
            )
        }

        item {
            //Video Preview Carousel
            VideoCarousel(previews = listOf(painterResource(id = R.drawable.image_18),
                painterResource(id = R.drawable.image_19)
            ))
        }

        item {
            //Review & Ratings heading
            Text(
                text = "Review & Ratings",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFEEF2FB),
                    letterSpacing = 0.6.sp,
                ),
                modifier = Modifier
                    .padding(start = 24.dp, top = 20.dp))
        }

        item {
            //Comment 1
            Box (modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 16.dp,
                )) {
                Comments(
                    comment = CommentBase("Auguste Conte",
                        "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                        "February 14, 2019",
                        painterResource(R.drawable.avatar))
                )
            }
        }

        item {
            //Divider
            Box (
                Modifier
                    .border(width = 1.dp, color = DividerColor)
                    .padding(start = 38.dp, 1.dp)
                    .width(300.dp)
            ) {

            }
        }

        item {
            //Comment 1
            Box (modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 16.dp,
                )) {
                Comments(
                    comment = CommentBase("Jang Marcelino",
                        "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                        "February 14, 2019",
                        painterResource(R.drawable.avatar_2))
                )
            }
        }

        item {
            //Big yellow button
            InstallButton(
                onClick = {
                    Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, top = 20.dp, end = 24.dp, bottom = 40.dp)
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