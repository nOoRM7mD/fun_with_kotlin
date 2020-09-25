package com.example.funwithkotlin.funcationalprogramming

fun main(args: Array<String>) {

    val list = listOf("Hi", "Kotlin", "there", "fans")

    val containsT = listOf(false, true, true, false)

    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)
    val mapped = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapped)
}