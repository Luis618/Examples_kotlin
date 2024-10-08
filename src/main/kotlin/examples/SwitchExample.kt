package org.example.examples

object SwitchExample {
    fun exampleIfs(a: String) {
        if (a == "hola") {
            println("Hola mundo")
        } else if (a == "adios") {
            println("Esta es la despedida")
        } else if (a == "saludo") {
            println("El usuario quiere un saludo")
        } else {
            println(a)
        }
    }

    fun exampleWhen(a: String) {
        when (a) {
            "hola" -> println("Hola mundo")
            "adios" -> println("Esta es la despedida")
            "saludo" -> println("El usuario quiere un saludo")
            else -> println(a)

        }
    }
}
