package com.example.mostpopulouscountries.model

import com.example.mostpopulouscountries.R

class CityDataProvider {

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("1 China", 1_416_043_270, R.drawable.china1 ))
        cities.add(City("2 India", 1_409_128_296, R.drawable.india2))
        cities.add(City("3 United States", 336_673_595, R.drawable.united_states3 ))
        cities.add(City("4 Indonesia", 281_562_465, R.drawable.indonesia4 ))
        cities.add(City("5 Pakistan", 252_363_571, R.drawable.pakistan5 ))
        cities.add(City("6 Nigeria", 236_747_130, R.drawable.nigeria6 ))
        cities.add(City("7 Brazil", 220_051_512, R.drawable.brazil7 ))
        cities.add(City("8 Bangladesh", 168_697_184, R.drawable.bangladesh8 ))
        cities.add(City("9 Russia", 140_820_810, R.drawable.russia9 ))
        cities.add(City("10 Mexico", 130_739_927, R.drawable.mexico10 ))
    }
    fun getCities() = cities
}