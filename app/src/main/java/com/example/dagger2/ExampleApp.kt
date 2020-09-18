package com.example.dagger2

import android.app.Application
import com.example.dagger2.Dagger.AppComponent
import com.example.dagger2.Dagger.DaggerAppComponent
import com.example.dagger2.Dagger.DriverModule

class ExampleApp() : Application() {
    lateinit var component: AppComponent
    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.factory().create(DriverModule("Alexander"))
    }

    fun getAppComponent(): AppComponent {
        return component
    }
}
