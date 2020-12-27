package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityStaticBinding

class StaticDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityStaticBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_static)
        val user = User("Niharika", "Software Engineer")
        binding.user = user
    }
}