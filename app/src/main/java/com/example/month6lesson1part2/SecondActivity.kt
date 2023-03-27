package com.example.month6lesson1part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.month6lesson1part2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }
    private fun initClicker() {
        val text = intent.getStringExtra("result")
        with(binding) {
            edText.setText(text)
            btnBack.setOnClickListener {
             val resultText = edText.text.toString().trim()
             if (text?.isNotEmpty() == true){
                 val intent = Intent().apply {
                     putExtra("result",resultText)
                 }
                 setResult(RESULT_OK,intent)
             }
                finish()
            }
        }
    }
}