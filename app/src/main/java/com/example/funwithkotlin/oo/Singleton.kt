package com.example.funwithkotlin.oo

import android.view.View
import android.widget.AbsListView

object CountryFactory{
    val a =4

    fun createCountry ()= "Egypt"
}


object  DefaultClickListener : AbsListView.RecyclerListener{
    override fun onMovedToScrapHeap(view: View?) {
        println("moved to scrap heap")
    }

}
fun main(){
    CountryFactory.a
    CountryFactory.createCountry()

}