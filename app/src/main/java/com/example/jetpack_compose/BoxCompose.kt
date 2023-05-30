package com.example.jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose.ui.theme.Jetpack_ComposeTheme

class BoxCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting1("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to $name Repository !",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    Jetpack_ComposeTheme {
        Greeting("Jetpack Compose")
    }
}