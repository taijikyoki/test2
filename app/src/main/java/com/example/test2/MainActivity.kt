package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val text1: TextView = findViewById(R.id.text1)

        val str1 = "1-й"
        val str2 = "2-й"
        var q = 1

        button1.setOnClickListener {
            if (q == 1) {
                q = 2
                text1.text = str2
            } else {
                q = 1
                text1.text = str1
            }
        }

    }
}