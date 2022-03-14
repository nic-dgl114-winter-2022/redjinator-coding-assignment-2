package com.redjinator.coding_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.redjinator.coding_assignment_2.databinding.ActivityMainBinding
import com.redjinator.coding_assignment_2.fragments.ProfileFragment
import com.redjinator.coding_assignment_2.fragments.ListFragment

private const val TAG = "MainActivity.kt"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val profileFragment = ProfileFragment()
    private val infoFragment = ListFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // load the initial fragment
        replaceFragment(profileFragment)

        // Action Bar Title
        val actionBar = supportActionBar
        if(actionBar != null) {
            actionBar.title = "Profile"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        // Bottom Navigation Bar
        val bottomNavigation = binding.bottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_profile -> replaceFragment(profileFragment)
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