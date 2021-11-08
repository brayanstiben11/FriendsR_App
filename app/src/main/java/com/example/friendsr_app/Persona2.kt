package com.example.friendsr_app

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class Persona2 : AppCompatActivity() {

    lateinit var ratingBar : RatingBar
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona2)

        ratingBar = findViewById(R.id.ratingBar2)
        button = findViewById(R.id.back2)
        ratingBar.numStars=5
        ratingBar.rating = load()
        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener ()
            {
                    _, rating, _ ->
                Toast.makeText(this, "TU CALIFICACION FUE: " + rating.toInt(), Toast.LENGTH_SHORT).show()
                save(rating.toFloat());
            }
        button.setOnClickListener()
        {
            val intent = Intent (this, MainActivity :: class.java)
            startActivity(intent)
        }

    }

    fun save (f: Float)
    {
        val sharedPreference = getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        editor.putFloat("rating",f)
        editor.commit()

    }

    fun  load (): Float {
        val sharedPreference = getPreferences(Context.MODE_PRIVATE)
        var i : Float
        i = sharedPreference.getFloat("rating",0f)
        return i
    }
}