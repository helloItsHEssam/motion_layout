package com.iamhessam.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iamhessam.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isClosePlayer = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handlerTapped()
    }

    private fun handlerTapped() {
        binding.btnTop.setOnClickListener {
            if (isClosePlayer) {
                binding.motionLayout.transitionToEnd()

            } else {
                binding.motionLayout.transitionToStart()
            }

            isClosePlayer = !isClosePlayer
        }
    }
}