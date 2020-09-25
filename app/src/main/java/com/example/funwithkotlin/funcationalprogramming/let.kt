package com.example.funwithkotlin.funcationalprogramming

import java.io.File

fun main() {

    //scoping

    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    } // FileNotFoundException ,,, reader shouldn't be visible

    //For nullable

    val str: String? = "example"
    //without let
    if (str != null) {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
    //with let
    str?.let {
        if (it.isNotEmpty())
            it.toLowerCase()
    }
}