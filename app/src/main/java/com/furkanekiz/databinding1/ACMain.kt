package com.furkanekiz.databinding1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.furkanekiz.databinding1.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.ac_main)

        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun displayGreeting() {
        binding.apply {
            greetingTextView.text = "Hello! ${nameEditText.text}"
        }
    }
}