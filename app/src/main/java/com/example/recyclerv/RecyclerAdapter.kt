package com.example.recyclerv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val list: List<ElementOfList>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title: TextView? = null
        var description: TextView? = null
        var image: ImageView? = null

        init {
            title = itemView.findViewById(R.id.L_title)
            description = itemView.findViewById(R.id.L_description)
            image = itemView.findViewById(R.id.L_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_of_element, parent, false)
        return ViewHolder(listView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title?.text = list[position].title
        holder.description?.text = list[position].description
        holder.image?.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}