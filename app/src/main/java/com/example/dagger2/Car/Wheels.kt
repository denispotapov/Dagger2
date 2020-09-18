package com.example.dagger2.Car


// мы не можем аннотировать данный класс с помощью @Inject
class Wheels (private val rims: Rims, private val tires: Tires) {

}