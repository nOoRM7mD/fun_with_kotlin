package com.example.funwithkotlin.oo

class Source<out T>(val t: T) {// class is a producer (منتج) for type T

    fun produceT(): T {
        return t
    }
}

class Sink<in T> { //Contra variance(consumer مستهلك) class this class can't produce T.
// all methods in this class can't return T

    fun consumeT(t: T) {
        //...
    }
}

fun main() {
    /** Any type represents the super type of all non-nullable types.**/

    val strSource = Source("producer")
    val anySource: Source<Any> = strSource //out -> covariance
    anySource.produceT()

    val anySink: Sink<Any> = Sink()  // in -> contra variance
    val strSink: Sink<String> = anySink
    strSink.consumeT("Consumer")

    //covariance vs Contra variance
    val person: MutableList<Person> = mutableListOf(Student(), Student())//covariance
    // val p :Person = Being() //Contra variance inverse inheritance
}

open class Being
open class Person : Being()
class Student : Person()