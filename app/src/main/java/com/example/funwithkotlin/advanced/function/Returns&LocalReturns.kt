package com.example.funwithkotlin.advanced.function

//ex 1:-
fun containingFunction() {
    val numbers = 1..100

    numbers.forEach {
        it % 5 == 0
        return
    }

    println("Local return works") // this doesn't executed
}

//ex 2:-
fun containingLocalReturnWithLambdaLabel() {
    val numbers = 1..100

    numbers.forEach foreachLabel@{
        it % 5 == 0
        return@foreachLabel
    }

    println("Local return works With Lambda Label")
}

//ex 3:-
fun containingLocalReturnWithAnonymousFun() {
    val numbers = 1..100

    numbers.forEach(fun(x) {
        if (x % 5 == 0)
            return
    })

    println("Local return works WithAnonymous Fun")
}

fun main() {
    containingFunction()
    containingLocalReturnWithLambdaLabel()
    containingLocalReturnWithAnonymousFun()
}