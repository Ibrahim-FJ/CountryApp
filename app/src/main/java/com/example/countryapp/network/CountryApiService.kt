package com.example.countryapp.network

import com.example.countryapp.countryinterface.CountryApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "https://countriesnow.space/api/v0.1/countries/flag/"

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL).build()



object CountryApi {
    val retrofitService : CountryApiService by lazy {
        retrofit.create(CountryApiService::class.java)
    }
}