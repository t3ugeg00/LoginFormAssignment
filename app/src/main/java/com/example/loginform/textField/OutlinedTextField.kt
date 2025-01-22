package com.example.loginform.textField

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedTextFieldStyled (label: String, icon: ImageVector, contentDescription: String = "") {
    var txt by remember { mutableStateOf("") }
    OutlinedTextField (
        value = txt,
        onValueChange = { txt = it },
        modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp, bottom = 20.dp),
        label = { Text(label) },
        trailingIcon = {
            Icon(icon, contentDescription = contentDescription)
        }
    )
}