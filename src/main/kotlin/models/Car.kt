package org.example.models

class Car(
   private val brand: String,
    val model: Int,
   private val numDoors: Int,
) {
    fun speed(kmPerHour: Float){
        println("EL carro arranco y acelero: $kmPerHour Km/hr")


    }
    fun details(){
        println("Marca: $brand\nModelo: $model\nNumero de puertas: $numDoors")

    }
}
//concatenar

//Clase es la manera de representar datos a manera de objetos
