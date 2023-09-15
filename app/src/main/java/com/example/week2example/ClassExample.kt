package com.example.week2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week2example.databinding.ActivityMainBinding

class ClassExample : AppCompatActivity() {
    //Step 1 - define a global variable to hold all of the id's
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Step 2 - initialize the global variable
        binding = ActivityMainBinding.inflate(layoutInflater)

        //Step 3 - connect the view to binding root
        setContentView(binding.root)
    }
}