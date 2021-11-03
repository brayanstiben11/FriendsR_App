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
        val persona2 : ImageButton = findViewById(R.id.persona2)
        val persona3 : ImageButton = findViewById(R.id.persona3)
        val persona4 : ImageButton = findViewById(R.id.persona4)

        persona1.setOnClickListener()
        {
            val intent = Intent (this, Persona1 :: class.java)
            startActivity(intent)
        }
        persona2.setOnClickListener()
        {
            val intent = Intent (this, Persona2 :: class.java)
            startActivity(intent)
        }
        persona3.setOnClickListener()
        {
            val intent = Intent (this, Persona3 :: class.java)
            startActivity(intent)
        }
        persona4.setOnClickListener()
        {
            val intent = Intent (this, Persona4 :: class.java)
            startActivity(intent)
        }
    }
}