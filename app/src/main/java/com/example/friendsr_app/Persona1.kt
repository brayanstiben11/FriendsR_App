package com.example.friendsr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Persona1 : AppCompatActivity() {

    lateinit var ratingBar : RatingBar
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona1)
        
        ratingBar = findViewById(R.id.ratingBar)
        ratingBar.numStars=5
        textView = findViewById(R.id.texto1)
        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener ()
            {
                _, rating, _ ->
                Toast.makeText(this, "Estrellas:" + rating.toInt(), Toast.LENGTH_SHORT).show()
            }
    }
}