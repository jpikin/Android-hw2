package com.example.a2hw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a2hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.customView.setText1("Верхняя строчка, настроенная из кода")
        binding.customView.setText2("Нижняя строчка, настроенная из кода")
    }
}