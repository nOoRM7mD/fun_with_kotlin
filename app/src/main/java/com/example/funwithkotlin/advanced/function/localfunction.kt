package com.example.funwithkotlin.advanced.function

//ex 1:-
fun outerFun(param: String) {
    val outerParam = "outer param"

    fun innerLocalFun(innerParam: String) {
        println(param)
        println(innerParam)
        println(outerParam)
    }
}

//ex 2:-
fun accumulate(number: Int): Int {

    var givenNumber = number
    fun add() {
        givenNumber++
    }
    for (i in 1..10) {
        add()
    }
    return givenNumber
}

//ex 3:-
fun calculateBMI(weightINkg: Double, heightInCm: Double): Double {

    fun calculateBMI(weightINkg: Double, heightInCm: Double): Double {
        val heightInMeter = heightInCm / 100
        return weightINkg / (heightInMeter * heightInMeter)
    }

    // Calculate BMI using the nested function
    return calculateBMI(weightINkg, heightInCm)
}

fun main() {
    outerFun("Hello")

    println(accumulate(12))
    println(calculateBMI(100.0, 200.0))
}