package ca.georgiancollege.comp3025_w2024_week9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ca.georgiancollege.comp3025_w2024_week9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Declare an instance of the binding class
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // read JSON file and convert to TVShow Data
        val favouriteTVShows = DataManager.instance.deserializeJSON(this)

        // pass the TVShow data to the RecycleView Adapter
        val firstAdapter = FirstAdapter(favouriteTVShows)
        // Use view binding to replace findViewById or synthetic properties
        binding.FirstRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = firstAdapter
        }
    }
}
