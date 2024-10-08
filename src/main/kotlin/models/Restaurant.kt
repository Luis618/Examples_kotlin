package org.example.models

data class Restaurant(
    var name: String = "",
    var type: String = "",
    var chairs: Int = 0,
    var tables: Int = 0,
    var employees: List<Empleado> = emptyList()

)
