package com.example.myteacher

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeacherAdapter(private val teachers: List<Teacher>) :
    RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder>() {

    class TeacherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.teacherNameTextView)
        val subjectTextView: TextView = itemView.findViewById(R.id.teacherSubjectTextView)
        val ratingTextView: TextView = itemView.findViewById(R.id.teacherRatingTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_teacher, parent, false)
        return TeacherViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val teacher = teachers[position]
        holder.nameTextView.text = teacher.name
        holder.subjectTextView.text = teacher.subject
        holder.ratingTextView.text = teacher.rating
    }

    override fun getItemCount(): Int = teachers.size
}