package com.example.smartpark.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartpark.R
import com.example.smartpark.databinding.ActivityMainBinding
import com.example.smartpark.ui.fragment.MainFragment
import com.example.smartpark.ui.fragment.MapFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> showFragment1()
                R.id.item2 -> showFragment2()
            }
            true
        }
    }

    private fun showFragment1() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, MainFragment())
            .commit()
    }

    private fun showFragment2() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, MapFragment())
            .commit()
    }
}