package com.example.funwithkotlin.funcationalprogramming

fun main(args: Array<String>) {

    val list = (1..100).toList()

    var first10 = list.take(10)

    println("first10 $first10")

    //
    val sequence = generateSequence(0) {
        println("Calculating ${it + 10}")
        it + 10
    }
    first10 = sequence.take(10).toList()

    val first20 = sequence.take(20).toList()

    val drop50 = list.drop(50).toList()

    println("sequence $first10 ")
    println("first20 $first20")
    println("drop50 $drop50")
}