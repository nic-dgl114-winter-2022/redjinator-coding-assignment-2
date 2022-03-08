package com.redjinator.coding_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionBar = supportActionBar

        if(actionBar != null) {
            actionBar.title = "Avocado"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }
}