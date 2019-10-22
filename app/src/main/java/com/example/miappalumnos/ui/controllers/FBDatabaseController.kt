package com.example.miappalumnos.ui.controllers

import com.example.miappalumnos.model.Student
import com.google.android.gms.tasks.Task
import com.google.firebase.database.FirebaseDatabase

class FBDatabaseController {
    private var database = FirebaseDatabase.getInstance().reference
    private val STUDENT = "Students"
    private val Carreras = "Carreras"

    fun saveStudent(student: Student): Task<Void> =
        database.child(STUDENT).child(student.numberDni).setValue(student)

    /*fun getCareersByInstitute(institute: String): ArrayList<String> =
        database.child(Carreras).child(institute)*/
}