package com.example.school_checkwork_profile1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.school_checkwork_profile1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
    }
}