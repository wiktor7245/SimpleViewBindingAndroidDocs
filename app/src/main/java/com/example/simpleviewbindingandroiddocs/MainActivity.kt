package com.example.simpleviewbindingandroiddocs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpleviewbindingandroiddocs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(binding.root)

        binding.btnClickMe.setOnClickListener {
            binding.tvHello.text =  if(binding.tvHello.text ==  "Clicked!") "Unclicked!" else "Clicked!"
        }
    }
}