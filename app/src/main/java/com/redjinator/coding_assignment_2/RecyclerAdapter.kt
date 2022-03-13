package com.redjinator.coding_assignment_2

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.redjinator.coding_assignment_2.databinding.ActivityMainBinding
import com.redjinator.coding_assignment_2.fragments.ProfileFragment

private val TAG = "RecyclerAdapter"

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private var titles  = arrayOf("Avocado", "Gary Goodspeed", "Quinn", "Mooncake", "Kvn", "Final Space")
    private var details = arrayOf("Friend mode, Engaged!", "This.. is the real raw Gary!", "Quinn detail/quote", "Choh-ka-dee Pok!", "Your deep space insanity avoidance robot", "The funniest show, Ever!")
    private var images  = arrayOf(R.drawable.avacado, R.drawable.gary, R.drawable.quinn, R.drawable.mooncake, R.drawable.kvn, R.drawable.cardback)
    private var activities = arrayOf(MainActivity::class.java, GaryActivity::class.java,GaryActivity::class.java,GaryActivity::class.java,GaryActivity::class.java,GaryActivity::class.java)




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

        // Add button text
        holder.itemButton.text = "Show Profile"

        // setOnClickListener
        holder.itemButton.setOnClickListener {

            Log.d(TAG, "itemButton ${holder.itemTitle.text} was clicked")

            // Required to call startActivity
            val context = holder.itemView.context
            val intent = Intent(context, activities[position])
            context.startActivity(intent)
        }

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemButton: Button

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemButton = itemView.findViewById(R.id.item_button)
        }


    }

}