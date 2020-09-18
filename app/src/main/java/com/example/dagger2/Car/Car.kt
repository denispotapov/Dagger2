package com.example.dagger2.Car

import android.util.Log
import com.example.dagger2.Dagger.PerActivity
import javax.inject.Inject

const val TAG = "Car"

@PerActivity
class Car @Inject constructor(private val driver: Driver, private val engine: Engine, private val wheels: Wheels) {


 //инъекция метода
@Inject
fun enableRemote(remote: Remote) {
     remote.setListener(this)
 }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver + ${driver.name} + drives + $this")
    }
}