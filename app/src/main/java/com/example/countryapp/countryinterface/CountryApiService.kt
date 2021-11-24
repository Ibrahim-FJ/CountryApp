package com.example.countryapp.countryinterface

import com.example.countryapp.model.Country
import com.example.countryapp.model.CountryList
import retrofit2.http.GET

interface CountryApiService {
    @GET("images")
    suspend fun getPhoto(): CountryList
}