package com.example.funwithkotlin.oo

import java.util.*

class TimeLine<E> {

    val date2Date: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Date[Date()] = element
    }

    fun getTheLatest(): E {
        return date2Date.values.last()
    }
}

fun main() {

    val timeLine: TimeLine<Int> = TimeLine()

    timeLine.add(2)
    timeLine.getTheLatest()
}