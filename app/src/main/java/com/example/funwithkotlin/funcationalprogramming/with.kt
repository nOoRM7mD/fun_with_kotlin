package com.example.funwithkotlin.funcationalprogramming

fun main() {
        val props = System.getProperties()

        //using with more readable
        with(props) {
            list(System.out)
            println(propertyNames().toList())
            println(getProperty("user.home"))
        }

    //without @with
    props.list(System.out)
    props.propertyNames().toList()
    props.getProperty("user.home")
}