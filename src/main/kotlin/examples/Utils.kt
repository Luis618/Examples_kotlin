package org.example.examples

object Utils {
    fun exampleForEach(arreglo: Array<String>){

        //lambda

        arreglo.forEach { name ->
            println(name)
        }

    }
    fun exampleForLoop(arreglo : Array<Int>){
        for (patito in arreglo){
            println(patito)
        }
        for(i in 0..20){
            println(i)
        }
        for(i in 10 downTo 2 step 2){
            println(i)
        }
        for (index in 0 until arreglo.size ){
            println(arreglo[index])
        }

    }
    fun exampleWhile(array: Array<String>){
        var index = 0
        while(index<array.size){
            println(array[index])
            index++
        }
        val newNames = arrayOf("Armando", "Eunice","Humberto")
        var i = 0
        do{
            println(newNames[i])
            i++
        } while (newNames[i] !="Humberto")
    }
}