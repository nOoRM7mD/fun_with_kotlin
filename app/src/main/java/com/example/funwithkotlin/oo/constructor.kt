package com.example.funwithkotlin.oo

class CityA (val name: String , val area: Int){ //primary constructor

    constructor(name: String) :this (name , 0) // secondary constructor delegated to the primary
    {
        println(" secondary constructor ")
    }
}

fun main() {
    val span = CityA("Span" , 34_000_00)

    println(span.name)
    println(span.area)

    val paris = CityA("Paris")

    println(paris.name)
    println(paris.area)
}