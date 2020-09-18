package com.example.dagger2.Dagger

import com.example.dagger2.Car.Car
import com.example.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

   /* @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }
*/
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horse power") horsePower: Int,
                   @BindsInstance @Named("engine capacity") engineCapacity: Int): ActivityComponent
    }
}