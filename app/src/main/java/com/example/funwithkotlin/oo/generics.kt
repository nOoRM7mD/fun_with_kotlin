package com.example.funwithkotlin.oo

import java.util.*

//generic class
class TimeLine<E> {

    val date2Date: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Date[Date()] = element
    }

    fun getTheLatest(): E {
        return date2Date.values.last()
    }
}

//generic fun
fun <T> timeLineOf(vararg elements: T): TimeLine<T> {
    val result = TimeLine<T>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main() {

    val timeLine: TimeLine<Int> = TimeLine()

    timeLine.add(2)
    timeLine.getTheLatest()

    val timeLine2 = timeLineOf("hi", "bye")
}