package com.cookandroid.todolist

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cookandroid.todolist.ui.theme.ToDOListTheme

class TodoActivity : AppCompatActivity() {
    private val todoViewModel by viewModels<TodoViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDOListTheme {
                Surface {
                    TodoActivityScreen(todoViewModel)
                }
            }
        }
    }
}

@Composable
private fun TodoActivityScreen(todoViewModel: TodoViewModel) {
    val items: List<MenuItem> by todoViewModel.menuItems.observeAsState(listOf())
    TodoScreen(
        items = items,
        onAddItem = { todoViewModel.addItem(it) },
        onRemoveItem = { todoViewModel.removeItem(it) }
    )
}

