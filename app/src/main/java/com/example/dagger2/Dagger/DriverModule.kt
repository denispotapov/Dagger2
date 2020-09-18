package com.example.dagger2.Dagger

import com.example.dagger2.Car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DriverModule(private val driverName: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(driverName)
    }
}