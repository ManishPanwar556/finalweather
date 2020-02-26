package com.example.finalweather

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val appkey="2ad451c95f6aa44170c6a9ded893f7e1"
interface weatherservice {
// by city name
    @GET("/{city}/$appkey")
    fun getcitydata(@Path("city") city:String):Response<Weather>


}