package com.maxi.composeplaygorund

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewRow()
        }
    }
}

/*
    Column Layout in compose
*/

@Composable
fun PreviewColumn() {
    Column(
        modifier = Modifier
            .background(color = Color(0xfff2f2f2))
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_background
            ),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "Some Text Line 1, which will span across multiple lines and we shall se how eliipsis works in this case.",
            style = TextStyle(
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,
                color = Color(0xFFeb23eb)
            ),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "Random Text Line 2",
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "Woah Text Line 3",
            style = typography.subtitle2
        )
    }
}

/*
    Row Layout in compose
*/

@Composable
fun PreviewRow() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = Color(0xfff2f2f2))
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Left Text",
                style = TextStyle(
                    fontSize = 20.sp
                )
            )

            Text(
                text = "Right Text",
                style = TextStyle(
                    fontSize = 20.sp,
                ),
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Text(
            text = "Second Line of Text"
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(
            onClick = {},
            modifier =
            Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Button")
        }
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    PreviewRow()
}
