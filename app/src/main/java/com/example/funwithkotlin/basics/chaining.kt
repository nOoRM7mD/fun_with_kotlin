package com.example.funwithkotlin.basics

fun main() {
    val inputRows = listOf(
        mapOf("element1" to listOf(3,-33432, 5,44)),
        mapOf("element2" to listOf(5,7752, 5,44)),
        mapOf("element3" to listOf(3,99, 5,44)))


    val chaining = inputRows.flatMap { it.values }
        .flatten()
        .filter { it in 0 ..100 } //[3, 5, 44, 5, 5, 44, 3, 99, 5, 44]
        .toIntArray() //3, 5, 44, 5, 5, 44, 3, 99, 5, 44

    println(chaining.joinToString())
}