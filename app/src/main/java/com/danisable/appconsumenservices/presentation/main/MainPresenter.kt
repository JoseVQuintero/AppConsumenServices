package com.danisable.appconsumenservices.presentation.main

import android.util.Log
import com.danisable.appconsumenservices.data.remote.RetrofitBuilder
import com.danisable.appconsumenservices.data.remote.responses.PriceResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(private val view: MainInteractor.View): MainInteractor.Presenter {

    private lateinit var retrofit: RetrofitBuilder

    override fun getPrice() {
        retrofit = RetrofitBuilder()
        val call = retrofit.getPrice()

        call.enqueue(object: Callback<PriceResponse>{
            override fun onResponse(call: Call<PriceResponse>, response: Response<PriceResponse>) {
                if(response.isSuccessful){
                    view.setPrice(response.body().toString())
                }
            }

            override fun onFailure(call: Call<PriceResponse>, t: Throwable) {
                Log.e("TAG","${t.message}")
            }

        })
    }

}