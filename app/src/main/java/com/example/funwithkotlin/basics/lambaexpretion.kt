package com.example.funwithkotlin.basics

fun main() {

    val list = (1..10).toList()

    println(list.filter(::isEven))
    println(list.filter { it.odd() })
}

//higher order fun
fun isEven(i: Int) = i % 2 == 0

//extension fun
fun Int.odd() = this % 2 == 1
