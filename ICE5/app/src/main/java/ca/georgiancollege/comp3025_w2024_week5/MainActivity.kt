package ca.georgiancollege.comp3025_w2024_week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ca.georgiancollege.comp3025_w2024_week5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var calculator: Calculator

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculator = Calculator(binding)
    }

}