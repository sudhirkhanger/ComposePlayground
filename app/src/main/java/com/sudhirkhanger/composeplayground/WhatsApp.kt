package com.sudhirkhanger.composeplayground

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sudhirkhanger.composeplayground.ui.theme.ComposePlaygroundTheme

@Composable
fun ChatRow() {
    Row {
        Icon(imageVector = Icons.Rounded.Face, contentDescription = "")
        Column(
            Modifier.fillMaxWidth()
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Sudhir Khanger")
                Text(text = "8:43 am")
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Nice apartment. You have")
                Icon(imageVector = Icons.Rounded.Face, contentDescription = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsAppPreview() {
    ComposePlaygroundTheme {
        Greeting("Android")
    }
    ComposePlaygroundTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            ChatRow()
        }
    }
}
