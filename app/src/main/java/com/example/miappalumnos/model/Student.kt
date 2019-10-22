package com.example.miappalumnos.model

data class Student(
    var name: String? = "",
    var lastName: String? = "",
    var numberDni: String,
    var email: String? = ""
)