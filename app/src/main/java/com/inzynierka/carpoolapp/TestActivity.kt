package com.inzynierka.carpoolapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.inzynierka.carpoolapp.databinding.ActivityTestBinding

private lateinit var binding: ActivityTestBinding

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //test database
        binding.testshit.setOnClickListener {
            val database = Firebase.database
            val myRef = database.getReference("message")
            myRef.setValue("Hello, World!")

        }
    }
}