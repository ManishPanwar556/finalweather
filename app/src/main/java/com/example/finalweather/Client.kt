package com.example.finalweather

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Client {
    val gson =
        GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()
    val retrofit = Retrofit.Builder().baseUrl("http://api.openweathermap.org/data/2.5/weather?").addConverterFactory(GsonConverterFactory.create(gson)).build()

    val api= retrofit.create<weatherservice>()
}