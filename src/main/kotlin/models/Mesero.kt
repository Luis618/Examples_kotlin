package org.example.models

data class Mesero(
    var name: String = "",
    var salary: Float = 0f,
    var lastname: String = ""
) : Empleado() {
    override fun trabaja() {
        super.trabaja()
        println("El mesero: $name comenzo a trabajar")
    }
}
// data class es para representar datos sin funciones (cuando se heredan clases es la excepcion de tener funciones en una data)
data class Cocinero(
    var name: String = "",
    var lasName: String = "",
    var salary: Int = 0,
    var daysOfWork: Int = 0,
) : Empleado() {  // si tiene el pasrentesis es una herencia si no la tiene es una interface
    override fun trabaja() {
        super.trabaja()
        println("El cocinero : $name comienza a trabajar")

    }

    override fun increaseSalary() {
        super.increaseSalary()
    }
}
//Herencia de clase es decir cocinero pertence a Emleado

open class Empleado {
    open fun trabaja() {
        println("El trabajador empieza a trabajar")
    }

    open fun increaseSalary(){

        //open es para que se pueda usar ya sea funcion o controlador

    }
}