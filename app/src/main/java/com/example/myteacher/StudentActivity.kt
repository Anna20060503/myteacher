package com.example.myteacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val teachersRecyclerView = findViewById<RecyclerView>(R.id.teachersRecyclerView)

        // Заглушка с тестовыми данными
        val teachers = listOf(
            Teacher("Иванов А.С.", "Математика", "4.8"),
            Teacher("Петрова М.И.", "Физика", "4.9"),
            Teacher("Сидоров В.П.", "Информатика", "4.7"),
            Teacher("Козлова Е.В.", "Английский язык", "4.6")
        )

        val adapter = TeacherAdapter(teachers)
        teachersRecyclerView.layoutManager = LinearLayoutManager(this)
        teachersRecyclerView.adapter = adapter
    }
}