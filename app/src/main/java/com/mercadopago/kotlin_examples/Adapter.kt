package com.mercadopago.kotlin_examples

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class Adapter: RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    private val items = ArrayList<String>().apply {
        add("hernan")
        add("cristian")
        add("guche")
        add("mati")
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val item =LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item,viewGroup,false)
            as TextView

        return MyViewHolder(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        viewHolder.textView.text = items[position]
    }
}
