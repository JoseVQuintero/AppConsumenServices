package com.danisable.appconsumenservices.presentation.main

interface  MainInteractor {

    interface Presenter {
        fun getPrice()
    }

    interface View {
        fun setPrice(value: String)
    }

}