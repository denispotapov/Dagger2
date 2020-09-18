package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(TAG, "Diesel engine started. HorsePower $horsePower")
    }
}