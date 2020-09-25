package com.example.funwithkotlin.oo

class City {
    var name = ""
        get() = field
        set(value) {
            if (name.isBlank()) {
                field = value
            }
        }
    var population = 0
}

fun main() {
    val city = City()
    city.name = "Egypt"
    city.name = " "
    city.population = 100_000_000

    println(city.name)
    println(city.population)
}