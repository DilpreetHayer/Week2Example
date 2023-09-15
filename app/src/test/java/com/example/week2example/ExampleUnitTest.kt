package com.example.week2example

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readOnly(){
        //final string pizzaTopping = "pizzaTopping"
        val pizzaTopping = "pineapple"
        // pizzaTopping = "anchovies"

        println("One of the best pizza toppings is $pizzaTopping")
    }

    @Test
    fun changeVar(){
        var pizzaTopping = "pepperoni"
        pizzaTopping = "black olives"

        println("A great pizza topping is $pizzaTopping")
    }

    @Test
    fun allowForNull(){
        var pizzaPlace : String?

        pizzaPlace = null

        if (pizzaPlace.equals("Boston Pizza"))
            println("A great pizza place is $pizzaPlace")
        else
            println("pizzaPlace had a value of null")
    }

    @Test
    fun elvisOperator(){
        var flavor : String? = null

        println(flavor ?: "something else")

        flavor = "sausage"
        println(flavor ?: "something else")
    }

    //Java equivalent public int multiply(int left, int right)
    fun multiply(left : Int, right : Int=10) : Int{
        println("left: $left * right: $right = "+left*right)
        return left*right
    }

    @Test
    fun testMultiply(){
        assertEquals(12, multiply(6,2))
        assertEquals(60, multiply(6))
        assertEquals(15, multiply(right = 5, left = 3))
    }
}