package com.example.funwithkotlin.basics

fun main() {

    //map

    val list = (1..10).toList()

    val doubled = list.map { it.doubled() }
    list.map { it * 2 }

    println("Doubled collection items $doubled")

    // flatMap

    val nestedList = listOf(
        (1..10).toList(),
        (10..20).toList(),
        (20..40).toList()
    )

    val flatList = nestedList.flatMap { it.sortedDescending() }
    println("flat List sorted $flatList ")

    val notFlatList = nestedList.map { it.sortedDescending() }
    println("Not flat List sorted $notFlatList ")

    val flatTheNotFlattenList = nestedList.map { it.sortedDescending() }.flatten()
    println("Not flat List sorted $flatTheNotFlattenList ")


}

fun Int.doubled() = this * 2