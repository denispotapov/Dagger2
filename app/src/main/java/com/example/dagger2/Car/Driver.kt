package com.example.dagger2.Car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Driver(val name: String) {
    //нам не принадлежит этот класс, поэтому мы не можем аннотировать его с помощью @Inject
}