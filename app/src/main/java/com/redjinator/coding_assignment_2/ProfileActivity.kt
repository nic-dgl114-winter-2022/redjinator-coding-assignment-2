package com.redjinator.coding_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.redjinator.coding_assignment_2.databinding.ActivityMainBinding
import com.redjinator.coding_assignment_2.databinding.ActivityProfileBinding
import com.redjinator.coding_assignment_2.fragments.CharacterFragment
import com.redjinator.coding_assignment_2.fragments.ListFragment

private val TAG = "ProfileActivity.kt"

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private val characterFragment = CharacterFragment()
    private val infoFragment = ListFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(characterFragment)

        // Action Bar Title
        val actionBar = supportActionBar
        if(actionBar != null) {
            actionBar.title = "Profile"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        // Bottom Navigation Bar
        var bottom_navigation = binding.bottomNavigation
        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_profile -> replaceFragment(characterFragment)
                R.id.ic_main_list -> replaceFragment(infoFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.profile_fragment_container, fragment)
            transaction.commit()
        }
    }
}