package com.example.chapter6_topic2_proto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.chapter6_topic2_proto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModelUser : UserViewModel
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModelUser = ViewModelProvider(this).get(UserViewModel::class.java)
        binding.saveBtn.setOnClickListener{
            val name = binding.name.text.toString()

        }
    }
}