package com.example.funwithkotlin.advanced.function

infix fun String.shouldEqualTo(value: String) = this == value

fun main() {

    val outPut = "Hello"

    outPut shouldEqualTo "Hello"
}