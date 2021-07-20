package com.danisable.appconsumenservices.data.remote

import com.danisable.appconsumenservices.data.remote.responses.PriceResponse
import com.danisable.appconsumenservices.data.remote.services.ServicePrice
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    private lateinit var servicePrice: ServicePrice

    private val client = OkHttpClient.Builder().build()

    private val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://www.boredapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create()).client(client).build()

    fun getPrice(): Call<PriceResponse> {
        servicePrice = retrofit.create(ServicePrice::class.java)
        return servicePrice.getPrice()
    }
}