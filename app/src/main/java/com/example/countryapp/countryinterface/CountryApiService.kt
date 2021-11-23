package com.example.countryapp.countryinterface

import com.example.countryapp.model.Country
import retrofit2.http.GET

interface CountryApiService {
    @GET("images")
    suspend fun getPhoto(): List<Country>
}