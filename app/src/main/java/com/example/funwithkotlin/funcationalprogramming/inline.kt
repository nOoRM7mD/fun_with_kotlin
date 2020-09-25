package com.example.funwithkotlin.funcationalprogramming

/**
 * when using a Higher-order function with a lambda expression
Lambda expressions are compiled to classes (often anonymous classes
they need memory.

In order to reduce the memory overhead of such higher-order functions or lambda expression,
we can use the inline keyword which ultimately requests the compiler to not allocate memory
and simply copy the inlined code of that function at the calling place.
inline function copy the code to the calling place
 **/
inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main() {
    val modifiedStr = modifyString("kotlin is amazing") { it.toUpperCase() }

    println(modifiedStr)
}