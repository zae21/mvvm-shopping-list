package com.example.mvvmshoppinglist.ui.listitem

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.mvvmshoppinglist.R
import com.example.mvvmshoppinglist.data.adapters.ShoppingItemAdapter
import com.example.mvvmshoppinglist.data.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.dialog_add_item.*
import kotlinx.android.synthetic.main.shopping_item.*

class AddItemDialog(context: Context, var addDialogListener: AddDialogListener): AppCompatDialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_add_item)
        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()
            if(name.isEmpty() || amount.isEmpty()){
                Toast.makeText(context, "Please fill the input properly", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val item = ShoppingItem(name, amount.toInt())
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}