package com.example.countryapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import java.lang.Exception



import com.example.countryapp.network.CountryApi
import kotlinx.coroutines.launch


class CountryViewModel: ViewModel() {

    private var _country = MutableLiveData<String>()
    val country: LiveData<String> = _country

    init {
        getCountryPhoto()
    }


    fun getCountryPhoto() {
        viewModelScope.launch {
            try {

                _country.value = "Success: ${CountryApi.retrofitService.getPhoto().data.size}"

            }catch (e: Exception){
                _country.value = "Failure: ${e.message}"
            }
        }

    }
}