package com.example.mvvmshoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmshoppinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict=OnConflictStrategy.REPLACE)
    fun upsert(item: ShoppingItem)

    @Delete
    fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items")
    fun getAllItems() : LiveData<List<ShoppingItem>>

}