package com.example.dagger2.Dagger

import com.example.dagger2.Car.DieselEngine
import com.example.dagger2.Car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }

}