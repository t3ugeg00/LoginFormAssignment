package com.example.loginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginform.textField.OutlinedTextFieldStyled
import com.example.loginform.ui.theme.LoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginFormTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginForm(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun LoginForm (modifier: Modifier) {
    Column (
        modifier = modifier
    ) {
        Text (
            text = stringResource(R.string.title),
            modifier = Modifier.fillMaxWidth().padding(all = 20.dp),
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )
        OutlinedTextFieldStyled (
            label = stringResource(R.string.username),
            icon = Icons.Filled.Email,
            contentDescription = "Email icon"
        )
        OutlinedTextFieldStyled (
            label = stringResource(R.string.pwd),
            icon = Icons.Filled.Lock,
            contentDescription = "Lock icon"
        )
        Button (
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)
        ) {
            Text(stringResource(R.string.btnTxt))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginFormTheme {
        Greeting("Android")
    }
}