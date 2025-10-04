package com.example.learningcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val painter = painterResource(id = R.drawable.mig2000)
            val description = "MIG 2000-The Ramjet King"
            val title = "MIG 2000- The Ramjet King"

            Box(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 25.dp)
                    .fillMaxWidth(.5f)
            )
            {
                ImageCard(
                    painter = painter,
                    ImageDiscription = description,
                    title = title,
                    modifier = Modifier
                )
            }
        }
    }
}


@Composable

fun ImageCard(painter: Painter,ImageDiscription :String,title:String,modifier:Modifier=Modifier){
    Card(modifier = modifier.fillMaxWidth().background(color = Color.Red),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)

    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(painter = painter, contentDescription = ImageDiscription, contentScale = ContentScale.Crop)
            Box(modifier=Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                       colors =  listOf<Color>(
                           Color.Transparent,
                           Color.Black

                       ),
                        startY=300f
                    )
                )
            )
            Box(modifier= Modifier
                .fillMaxSize()
                .padding(15.dp),
                contentAlignment=Alignment.BottomStart){
                Text(title, style = TextStyle(color=Color.White,fontSize=16.sp))
            }
        }
    }
}


