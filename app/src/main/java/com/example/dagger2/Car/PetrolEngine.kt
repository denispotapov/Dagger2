package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") private val horsePower: Int,
                                       @Named("engine capacity") private val engineCapacity: Int) : Engine {

    override fun start() {
        Log.d(
            TAG, "Petrol engine started." +
                    "\n HorsePower $horsePower" +
                    "\n Engine Capacity $engineCapacity"
        )
    }
}