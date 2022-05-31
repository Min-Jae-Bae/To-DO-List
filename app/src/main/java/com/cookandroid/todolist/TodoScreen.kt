package com.cookandroid.todolist

import android.view.MenuItem
import androidx.compose.runtime.Composable

@Composable
fun TodoScreen(
   items: List<MenuItem>,
   onAddItem: (MenuItem) -> Unit,
   onRemoveItem: (MenuItem) -> Unit
) {}