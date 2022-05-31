package com.cookandroid.todolist

import android.view.MenuItem
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    // state: todoItems
    private var _menuItems = MutableLiveData(listOf<MenuItem>())
    val menuItems: LiveData<List<MenuItem>> = _menuItems

    // event: addItem
    fun addItem(item: MenuItem) {
        /* ... */
    }

    // event: removeItem
    fun removeItem(item: MenuItem) {
        /* ... */
    }

}