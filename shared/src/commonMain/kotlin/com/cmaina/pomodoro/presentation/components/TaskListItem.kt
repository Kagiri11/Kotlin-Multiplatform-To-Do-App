package com.cmaina.pomodoro.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cmaina.pomodoro.presentation.ui.theme.Grey

@Composable
fun TaskListItem(title: String) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .height(80.dp)
            .background(Grey),
        backgroundColor = Grey
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(text = title)
        }
    }
}