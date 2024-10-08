package org.example

import jdk.jshell.execution.Util
import models.Restaurante
import org.example.examples.SwitchExample
import org.example.examples.Utils
import org.example.models.*


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val names: Array<String> = arrayOf("Luis", "Francisco", "Lily", "Giovani", "Aurelia")
    val numbers: Array<Int> = arrayOf(11, 22, 33, 44)
    val meserosArrayList: ArrayList<Mesero> = ArrayList()
    val meseros: List<Mesero> = listOf(
        Mesero("Juan", 100.5f, "Perez"),
        Mesero("Edna", 250f, "Garcia")

    )
    meserosArrayList.add(Mesero("Juana", salary = 50f))
    val cocker1 = Cocinero("Pedro", "Gonzalez", 400, 2)
    cocker1.trabaja()


    Utils.exampleForEach(names)
    Utils.exampleForLoop(numbers)
    Utils.exampleWhile(names)

    val mustang: Car = Car("Ford", 2024, 2)
    mustang.speed(150.5f)
    mustang.details()

    println("Este carro es del modelo: ${mustang.model}")


    val restaurant = Restaurante("El restaurante del gordito")
    val r2 = Restaurante(4, 2, "Delicias", "Antojitos")
    val r3 = Restaurante("soberbias", "comidas")
    val numSillasR2 = r2.sillas
    restaurant.mesas = 10
    restaurant.sillas = 100
    val numMesasR3 = r3.mesas

    val rest1 = Restaurant("Delicias", "Antojitos", 2, 3)
    rest1.chairs

    val rest2 = Restaurant(name = "Delicias 2")
    val rest3 = Restaurant(name = "Delicias 3", type = "Antojitos")
    val rest4 = Restaurant(chairs = 40, name = "Delicias 4")

    rest1.employees = listOf(
        Cocinero("Luis", "Gonzalez", 2000, 6),
        Cocinero("Alonso", "muñoz", 3000, 20),
        Cocinero("Pedro", "Gonzalez", 400, 2),
        Mesero("Juan", 100.5f, "Perez"),
        Mesero("Edna", 250f, "Garcia")
    )
    val calculator = Calculator()
    println("la suma de 3 y 4 es: ${calculator.suma(3, 4)}")
    println("la resta de 3 y 4 es: ${calculator.minus(3, 4)}")
    println("la multiplicacion  de 3 y 4 es: ${calculator.multiply(3, 4)}")
    println("la divicion  de 3 y 4 es: ${calculator.divide(3, 4)}")
    println("la divicion  de 0 y 4 es: ${calculator.divide(0, 4)}")
    println("la divicion  de 5 y 0 es: ${calculator.divide(5, 0)}")
    SwitchExample.exampleIfs("hola")
    SwitchExample.exampleWhen("adios")

    rest2.chairs = 2
    rest2.type = "desayunos"
    rest2.tables = 40
// scoped function
    rest2.apply {
        chairs = 2
        type = "deayunos"
        tables = 40
    }
    val rest6 = Restaurant("Patito").apply {
        chairs = 4
        type = "Comidas"
        tables = 1
    }

    cocker1.also {
        val nose = 3
        it.trabaja()
    }
    var r1: Restaurant? = null
    if (r1 != null){
        println("Se creo el objeto")
           }
// la funcion let compara si es diferente de nulo
    r1?.let {
        println("se creo el objeto")
    } ?: run { r1 = Restaurant("test") }
}