package com.example.mvvmshoppinglist.ui.listitem

import com.example.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}