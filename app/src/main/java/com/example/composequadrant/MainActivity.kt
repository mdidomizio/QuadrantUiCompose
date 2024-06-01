package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun QuadrantOne(/*titleOne: String, descriptionOne: String,*/
                modifier: Modifier = Modifier
                    .padding(16.dp)
) {
    val backGroundColorOne = Color(0xFFEADDFF)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = backGroundColorOne)
            .padding(16.dp)

    ){
        Text(
            text = stringResource(R.string.title_one),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )

        Text(
            text = stringResource(R.string.description_one),
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun QuadrantTwo(/*titleOne: String, descriptionOne: String,*/
                modifier: Modifier = Modifier.padding(16.dp)
) {
    val backGroundColorTwo = Color(0xFFD0BCFF)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(color = backGroundColorTwo)
            .padding(16.dp)

    ){
        Text(
            text = stringResource(R.string.title_two),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )

        Text(
            text = stringResource(R.string.description_two),
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun QuadrantThree(/*titleOne: String, descriptionOne: String,*/
                modifier: Modifier = Modifier.padding(16.dp)
) {
    val backGroundColorThree = Color(0xFFB69DF8)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(color = backGroundColorThree)
            .padding(16.dp)

    ){
        Text(
            text = stringResource(R.string.title_three),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp),
        )

        Text(
            text = stringResource(R.string.description_three),
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun QuadrantFour(/*titleOne: String, descriptionOne: String,*/
                modifier: Modifier = Modifier.padding(16.dp)
) {
    val backGroundColorFour = Color(0xFFF6EDFF)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(color = backGroundColorFour)
            .padding(16.dp)

    ){
        Text(
            text = stringResource(R.string.title_four),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )

        Text(
            text = stringResource(R.string.description_four),
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = modifier.weight(1f)
        ) {
            QuadrantOne(
                modifier = modifier
                .weight(1f)
                .fillMaxSize()
            )
            QuadrantTwo(modifier = modifier
                .weight(1f)
                .fillMaxSize()
            )
        }
        Row (
            modifier = modifier.weight(1f)
        ) {
            QuadrantThree(modifier = modifier
                .weight(1f)
                .fillMaxSize()
            )
            QuadrantFour(modifier = modifier
                .weight(1f)
                .fillMaxSize()
            )
        }
    }

}