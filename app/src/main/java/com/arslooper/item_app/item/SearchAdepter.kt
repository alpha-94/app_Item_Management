package com.arslooper.item_app.item

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.arslooper.item_app.R

import kotlinx.android.synthetic.main.item_activity_search_item.view.*


class SearchAdepter(var mylist: MutableList<Item>): RecyclerView.Adapter<SearchAdepter.ViewHolder>(){
    override fun getItemCount() = mylist.size

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val item = mylist[p1]
        val listener = View.OnClickListener { it -> Toast.makeText(it.context, "Click", Toast.LENGTH_SHORT).show() }
        p0.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(p0.context)
                .inflate(R.layout.item_activity_search_item, p0, false)

        return ViewHolder(inflatedView)
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private var view: View = v

        fun bind(listener: View.OnClickListener, item: Item){
            view.text1.text = item.i1
            view.text3.text = item.i2
            view.setOnClickListener(listener)
        }
    }
}


