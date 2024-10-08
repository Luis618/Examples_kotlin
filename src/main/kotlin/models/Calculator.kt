package org.example.models

import org.example.Interfaces.Calculatorinter

class Calculator(
    val x : String = "",
    val y : Double = 0.0
): Calculatorinter {
    override fun suma(a: Int, b: Int): Int {
        return a + b
    }

    override fun minus(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiply(a: Int, b: Int) = a * b



    override fun divide(a: Int, b: Int): Float {
        return if (a == 0 || b == 0){
            println("Es una divicion entre 0 , no es posible")
            0f
        }else{
            a.toFloat() / b.toFloat()
        }

    }
}