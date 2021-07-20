package com.danisable.appconsumenservices.data.remote.services

import com.danisable.appconsumenservices.data.remote.responses.PriceResponse
import retrofit2.Call
import retrofit2.http.GET

interface ServicePrice {

    @GET("activity")
    fun getPrice(): Call<PriceResponse>
}