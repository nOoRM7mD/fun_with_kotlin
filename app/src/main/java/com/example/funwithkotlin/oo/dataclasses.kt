package com.example.funwithkotlin.oo

data class Address(val street:String,  val number: Int,val postCode: String ,val city: String)



fun main(){

    val residence = Address("Main Address" , 43, "12345", "Egypt")
    val residence2 = Address("Main Address" , 43, "12345", "Egypt")


    //generate toString()
    println(residence)

    // referential equality
    println(residence === residence2)

    //structural equality ,equals()
    println(residence == residence2)

    //copy
    val neighbor = residence.copy(number = 42)
    println(neighbor)

    //destructuring
    residence.component1()

    val(street, number ,postCode, city) = residence

    println(" $street $number , $postCode $city")

}