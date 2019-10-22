package com.example.miappalumnos.ui.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.miappalumnos.R
import com.example.miappalumnos.model.Student
import com.example.miappalumnos.ui.controllers.FBDatabaseController
import kotlinx.android.synthetic.main.activity_new_student.*


class NewStudent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_student)

        /*val adapter = ArrayAdapter<Contact>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            contacts
        )*/

        btnSend.setOnClickListener {
            val student = Student(
                etName.text.toString(),
                etLastName.text.toString(),
                etDni.text.toString(),
                etEmail.text.toString()
            )

            progressBar?.visibility = View.VISIBLE

            FBDatabaseController().saveStudent(student).addOnSuccessListener {
                finish()
            }

        }
    }
}
