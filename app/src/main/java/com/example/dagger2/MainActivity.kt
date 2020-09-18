package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2.Car.Car
import com.example.dagger2.Dagger.ActivityComponent
import com.example.dagger2.Dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //инъекция поля
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val component = ExampleApp().getAppComponent()
        val component: ActivityComponent = (application as ExampleApp).getAppComponent()
            .getActivityComponentFactory().create(120, 1600)


        component.inject(this)
        car1.drive()
        car2.drive()

        //инъекция конструктора
        /*val component: CarComponent = DaggerCarComponent.create()
        val car = component.getCar()
        car.drive()*/
    }
}