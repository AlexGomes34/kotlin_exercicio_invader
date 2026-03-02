package com.example.atividade_invaders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atividade_invaders.ui.theme.Atividade_invadersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Atividade_invadersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                      LayoutGameOver(modifier = Modifier.padding(innerPadding))
//                    Layout1(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LayoutGameOver(modifier: Modifier = Modifier){
    Box(modifier = modifier
        .fillMaxSize()
        .background(color = Color.Black),
        contentAlignment = Alignment.Center,
        )
    {
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center)
        {
            Cabecinha(modifier = Modifier
            .size(60.dp),
            color = Color.Green)
            Cabecinha(modifier = Modifier
                .size(60.dp),
                color = Color.Red)
            Cabecinha(modifier = Modifier
                .size(60.dp),
                color = Color.Blue)
            Cabecinha(modifier = Modifier
                .size(60.dp),
                color = Color.Yellow)
        }
        Text(text = "GAME OVER", fontSize = 60.sp, fontWeight = FontWeight.Bold, color = Color.White)
    }

}

@Composable
fun Layout1(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 170.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "SCORE: 0050", modifier = Modifier
                    .padding(start = 12.dp), fontSize = 25.sp,
                    fontWeight = FontWeight.Bold, color = Color.White)
                Row(
                    modifier = Modifier
                        .padding(end = 12.dp),
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    Text(text = "LIVES: ", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Cabecinha(modifier = Modifier,
                        color = Color.Green)
                    Cabecinha(modifier = Modifier,
                        color = Color.Green)
                    Cabecinha(modifier = Modifier,
                        color = Color.Green)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ){
                Cabecinha(modifier = Modifier
                    .size(50.dp),
                    color = Color.Green)
                Cabecinha(modifier = Modifier
                    .size(50.dp),
                    color = Color.Red)
                Cabecinha(modifier = Modifier
                    .size(50.dp),
                    color = Color.Blue)
                Cabecinha(modifier = Modifier
                    .size(50.dp),
                    color = Color.Yellow)
                Cabecinha(modifier = Modifier
                    .size(50.dp),
                    color = Color.Green)
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(top = 160.dp),
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom

            ) {
                Compose(modifier = Modifier
                    .size(70.dp),
                    color = Color.Blue)
            }
            Row(modifier = modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(40.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Text(text = "PRESS START", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
    }
}

@Composable
fun Cabecinha(modifier: Modifier = Modifier, color: Color){
    Image(
        painter = painterResource(R.drawable.outline_android_24) ,
        contentDescription = "cabecinha de android",
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}
@Composable
fun Compose(modifier: Modifier = Modifier, color: Color){
    Image(
        painter = painterResource(R.drawable.outline_activity_zone_24),
        contentDescription = "LOGO DO COMPOSE",
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}