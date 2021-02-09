package com.arslooper.item_app.item
import com.arslooper.item_app.R

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.item_activity_search_item.view.*


class SearchAdepter(var mylist: JsonObj): RecyclerView.Adapter<SearchAdepter.ViewHolder>(){

    override fun getItemCount(): Int {
    return mylist.result.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val item = mylist.result[p1]
        val listener = View.OnClickListener { it -> Toast.makeText(it.context, "Click", Toast.LENGTH_SHORT).show() }
        p0.bind(listener, item)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(p0.context)
                .inflate(R.layout.item_activity_search_item, p0, false)

        return ViewHolder(inflatedView)
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private var view: View = v

        fun bind(listener: View.OnClickListener, item: Item){
            view.item_text1.text = item.i1
            view.item_text2.text = item.i2
            view.item_text3.text = item.i3
            view.item_text4.text = item.i4
            view.setOnClickListener(listener)
        }
    }
}


