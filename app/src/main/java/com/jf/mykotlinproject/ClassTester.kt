package com.jf.mykotlinproject

/**
 * Created by admin on 2017/8/29.
 */
class Person{

    var lastname:String = "zhang"
    get() = field.toString()
    set

    var no:Int = 100
    get() = field
    set(value) {
        if (value > 10){
            field = value
        }else{
            field = -1
        }
    }

    var height:Float = 145.4f
    private set
}

fun main(args: Array<String>) {
    var person:Person = Person()

    person.lastname = "wang"
    println("lastname:${person.lastname}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")
}