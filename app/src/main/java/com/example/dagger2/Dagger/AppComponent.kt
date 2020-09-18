package com.example.dagger2.Dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }
}