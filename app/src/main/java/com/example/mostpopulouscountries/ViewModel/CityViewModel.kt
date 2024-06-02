package com.example.mostpopulouscountries.ViewModel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mostpopulouscountries.model.City
import com.example.mostpopulouscountries.model.CityDataProvider

class CityViewModel : ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private var delay = 2000L

    init {
        loop()
    }

    fun getCityData() : LiveData<City> = cityData

    private fun loop() {
        Handler(Looper.getMainLooper()).postDelayed({updataCity()}, delay)
    }

    private fun updataCity(){
        currentIndex++
        currentIndex %= cities.size
        cityData.value = cities[currentIndex]

        loop()
    }

}