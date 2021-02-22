package com.example.sunnyweather.UI.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.Logic.Repository
import com.example.sunnyweather.Logic.model.Place

class PlacViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations
        .switchMap(searchLiveData) { query-> Repository.searchPlaces(query) }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}