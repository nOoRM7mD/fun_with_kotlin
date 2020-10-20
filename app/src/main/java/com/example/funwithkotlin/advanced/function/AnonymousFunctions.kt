package com.example.funwithkotlin.advanced.function

//Anonymous fun is to declare function using fun keyword but without giving it a name
inline fun op(x: Int, op: (Int) -> Int): Int {
    println(op(x))
    return op(x)
}

fun main() {

    //using lambda expression
    op(2) { it * it }

    // using Anonymous fun
    op(22, fun(x): Int {

        return if (x > 10) {
            0
        } else {
            x * x
        }
    })
}