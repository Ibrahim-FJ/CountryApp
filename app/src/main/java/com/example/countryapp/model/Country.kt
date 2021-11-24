package com.example.countryapp.model


data class CountryList(var error: Boolean, val msg: String, val data: List<Country>)
data class Country (val name: String, val flag: String)