package com.example.funwithkotlin.funcationalprogramming

fun main() {
    //sequence for lazy evaluation

    val possibleNumbersAfter2 = generateSequence(3) { it + 2 }

    val primes = generateSequence(2 to possibleNumbersAfter2) {
        val p = it.second.first()

        val possibleNumberAfterP = it.second.filter { it % p != 0 }

        p to possibleNumberAfterP    //[(2, kotlin.sequences.GeneratorSequence@3af49f1c), (3, kotlin.sequences.FilteringSequence@19469ea2), (5, kotlin.sequences.Filteri.....

    }.map { it.first }   //[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

    println(primes.take(10).toList())
}