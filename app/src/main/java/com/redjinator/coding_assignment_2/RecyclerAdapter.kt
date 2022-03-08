package com.redjinator.coding_assignment_2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private var titles   = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six")
    private var details = arrayOf("Details One", "Details Two", "Details Three", "Details Four", "Details Five", "Details Six")
    private var images  = arrayOf(R.drawable.cardback, R.drawable.cardback, R.drawable.cardback, R.drawable.cardback, R.drawable.cardback, R.drawable.cardback)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)     // Layout Inflater
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return titles.size
    }


    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }




    /*
            VIEW HOLDER ----------------
     */
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

}