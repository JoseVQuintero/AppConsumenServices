package com.danisable.appconsumenservices.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danisable.appconsumenservices.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInteractor.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        presenter.getPrice()
    }

    override fun setPrice(value: String) {
        tvMessage.text = value
    }
}