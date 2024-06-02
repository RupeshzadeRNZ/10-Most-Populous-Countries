package com.example.mostpopulouscountries.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.mostpopulouscountries.R
import com.example.mostpopulouscountries.ViewModel.CityViewModel
import com.example.mostpopulouscountries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model: CityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        model.getCityData().observe(this, Observer { city ->
            Glide.with(this)
                .load(city.image) // Assuming city.image is a URL or resource ID
                .into(binding.cityImage)

            binding.cityNameTV.text = city.name
            binding.cityPopulationTV.text = "Population "+city.population.toString()
        })
    }
}
