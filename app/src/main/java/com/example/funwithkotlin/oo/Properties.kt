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
    val eqypt = City()
    eqypt.name = "Egypt"
    eqypt.name = " "
    eqypt.population = 100_000_000

    println(eqypt.name)
    println(eqypt.population)
}