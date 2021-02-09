package com.arslooper.item_app.item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arslooper.item_app.R
import kotlinx.android.synthetic.main.entry_activity_select.*
import kotlinx.android.synthetic.main.item_activity_search.*

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_activity_search)

        val list: MutableList<Item> = mutableListOf()
        list.add(Item("hi", "hi1"))
        list.add(Item("hi", "hi2"))
        list.add(Item("hi", "hi3"))
        list.add(Item("hi", "hi4"))

        val adapter = SearchAdepter(list)
        item_search_RecyclerView.adapter = adapter

    }
}