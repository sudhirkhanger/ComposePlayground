package com.sudhirkhanger.composeplayground.whatsapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sudhirkhanger.composeplayground.ui.theme.wAMessageColor

@Composable
fun ChatRow(
    name: String,
    time: String,
    message: String,
    profileImage: ImageVector,
    isMute: Boolean
) {
    Row {
        Icon(
            modifier = Modifier.size(56.dp),
            imageVector = profileImage,
            contentDescription = ""
        )
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onSurface
                )
                Text(text = time, color = wAMessageColor)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (isMute)
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(18.dp)
                    )
                Text(
                    text = message,
                    color = wAMessageColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f),
                )
                if (isMute)
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(18.dp)
                    )
            }
        }
    }
}

@Composable
fun MessageList() {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(20) {
            ChatRow(
                name = "John Doe",
                time = "8:43",
                message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                profileImage = Icons.Default.Face,
                isMute = true
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsAppPreview() {
    WhatsAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MessageList()
        }
    }
}
