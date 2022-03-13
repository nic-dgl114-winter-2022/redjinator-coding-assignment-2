package com.redjinator.coding_assignment_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.redjinator.coding_assignment_2.databinding.ActivityGaryBinding


private val TAG = "GaryActivity.kt"

class GaryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGaryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Action Bar Title
        val actionBar = supportActionBar
        if(actionBar != null) {
            actionBar.title = "Profile"
            actionBar.setDisplayHomeAsUpEnabled(false)
        }

        // Profile back button
        var garyBackButton = binding.garyButton
        garyBackButton.text = "Back"

        garyBackButton.setOnClickListener {
            Log.d(TAG, "gary's back button was clicked")

            // Required to call startActivity
            val context = garyBackButton.context
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }
}