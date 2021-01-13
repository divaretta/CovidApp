package com.diva.covidapp.api

import com.diva.covidapp.model.IndonesiaResponse
import com.diva.covidapp.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
     @GET("indonesia")
     fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

     @GET("indonesia/provinsi")
     fun getProvince(): Call<ArrayList<ProvinceResponse>>
}