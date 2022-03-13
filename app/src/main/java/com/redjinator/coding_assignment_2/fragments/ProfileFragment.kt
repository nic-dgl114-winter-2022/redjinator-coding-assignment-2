package com.redjinator.coding_assignment_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.redjinator.coding_assignment_2.R
import com.redjinator.coding_assignment_2.RecyclerAdapter



class ProfileFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val recycler_view = itemView.findViewById<RecyclerView>(R.id.fragment_recycler_view)

        recycler_view.apply {
            // set a LinearLayoutManager to handle RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)

            // set the custom adapter to the RecyclerView
            adapter = RecyclerAdapter()
        }
    }

}