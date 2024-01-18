package ca.georgiancollege.comp3025_w2024_week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetTextView = findViewById<TextView>(R.id.greetingTextView)
        greetTextView.text = "Hello Tom"

        Log.i("onCreate", "Saying Hello")
    }
}