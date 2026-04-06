package com.example.tasklistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tasklistapp.ui.TaskListScreen
import com.example.tasklistapp.ui.theme.TaskListAppTheme
import com.example.tasklistapp.viewmodel.TaskViewModel
import com.example.tasklistapp.viewmodel.TaskViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskListAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: TaskViewModel = viewModel(
                        factory = TaskViewModelFactory(application)
                    )
                    TaskListScreen(viewModel = viewModel)
                }
            }
        }
    }
}
