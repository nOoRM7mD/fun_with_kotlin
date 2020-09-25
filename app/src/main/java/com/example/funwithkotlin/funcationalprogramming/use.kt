package com.example.funwithkotlin.funcationalprogramming

import java.io.FileReader

fun main() {
    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
    }  // FileNotFoundException

    //without use you should close the file
}