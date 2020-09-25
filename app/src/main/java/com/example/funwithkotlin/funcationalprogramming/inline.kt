package com.example.funwithkotlin.funcationalprogramming

//inline function copy the code to the calling place
inline fun modifyString(str :String, operation :(String) -> String) :String {
   return operation(str)
}
fun main() {
   val modifiedStr = modifyString("kotlin is amazing") {it.toUpperCase()}

    println(modifiedStr)
}