package com.example.friendsr_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persona1 : ImageButton = findViewById(R.id.persona1)

        persona1.setOnClickListener()
        {
            val intent = Intent (this, Persona1 :: class.java)
            startActivity(intent)
        }
    }
}