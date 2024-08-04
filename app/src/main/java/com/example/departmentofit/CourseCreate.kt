package com.example.departmentofit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class CourseCreate : AppCompatActivity() {
    private var courseList = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val course1 = "Mobile Application Development"
        val prereq1 = "None"
        val code1 = "ITT420"
        val credits1 = 3
        val descrip1 = "Creation of applications for android mobile devices"

        val course2 = "Introduction to Psychology"
        val prereq2 = "None"
        val code2 = "PSY100"
        val credits2 = 3
        val descrip2 = "Fundamentals of the study of human behaviour"

        val course3 = "Computer Essentials and Troubleshooting"
        val prereq3 = "None"
        val code3 = "ITT116"
        val credits3 = 3
        val descrip3 = "Basics of how to troubleshoot basic technological errors"

        val course4 = "Academic Writing"
        val prereq4 = "None"
        val code4 = "ENG109"
        val credits4 = 3
        val descrip4 = "Prinicples of writing literature for academic purposes"

        val course5 = "Introduction to Spanish"
        val prereq5 = "None"
        val code5 = "SPA101"
        val credits5 = 3
        val descrip5 = "Introduction to spanish words and phrases"

        val course6 = "Cloud Computing"
        val prereq6 = "ITT209 Building Application using C#"
        val code6 = "ITT318"
        val credits6 = 3
        val descrip6 = "Lessons on how to implement cloud computing to execute tasks"

        val course7 = "Entrepreneurship for IT Professionals"
        val prereq7 = "ITT310 Systems Analysis & Design"
        val code7 = "ITT319"
        val credits7 = 3
        val descrip7 = "Fundamentals needed for to develop businesses in the technological field."

        val course8 = "Human Computer Interaction and Interface Design"
        val prereq8 = "ITT310 System Analysis and Design and/or PSY100 Introduction to Psychology"
        val code8 = "ITT405"
        val credits8 = 3
        val descrip8 = "Fundamentals into the science behind the design of user interface."

        val course9 = "Building Application Using C#"
        val prereq9 = " ITT200 Object Oriented Programming using C++"
        val code9 = "ITT209"
        val credits9 = 3
        val descrip9 = "Creation of applications using C#"

        val course10 = "Introduction to Literature"
        val prereq10 = "None"
        val code10 = "ENG102"
        val credits10 = 3
        val descrip10 = "Fundamentals of the study of pieces of writing"

        val courseMap =hashMapOf(
            "Course Name" to course1,
            "Pre-requisites" to prereq1,
            "Credits" to credits1,
            "Description" to descrip1,
            "Course Code" to code1)

        val courseMap2 =hashMapOf(
            "Course Name" to course2,
            "Pre-requisites" to prereq2,
            "Credits" to credits2,
            "Description" to descrip2,
            "Course Code" to code2)
        val courseMap3 =hashMapOf(
            "Course Name" to course3,
            "Pre-requisites" to prereq3,
            "Credits" to credits3,
            "Description" to descrip3,
            "Course Code" to code3)

        val courseMap4 =hashMapOf(
            "Course Name" to course4,
            "Pre-requisites" to prereq4,
            "Credits" to credits4,
            "Description" to descrip4,
            "Course Code" to code4)

        val courseMap5 =hashMapOf(
            "Course Name" to course5,
            "Pre-requisites" to prereq5,
            "Credits" to credits5,
            "Description" to descrip5,
            "Course Code" to code5)

        val courseMap6 =hashMapOf(
            "Course Name" to course6,
            "Pre-requisites" to prereq6,
            "Credits" to credits6,
            "Description" to descrip6,
            "Course Code" to code6)

        val courseMap7 =hashMapOf(
            "Course Name" to course7,
            "Pre-requisites" to prereq7,
            "Credits" to credits7,
            "Description" to descrip7,
            "Course Code" to code7)

        val courseMap8 =hashMapOf(
            "Course Name" to course8,
            "Pre-requisites" to prereq8,
            "Credits" to credits8,
            "Description" to descrip8,
            "Course Code" to code8)

        val courseMap9 =hashMapOf(
            "Course Name" to course9,
            "Pre-requisites" to prereq9,
            "Credits" to credits9,
            "Description" to descrip9,
            "Course Code" to code9)

        val courseMap10 =hashMapOf(
            "Course Name" to course10,
            "Pre-requisites" to prereq10,
            "Credits" to credits10,
            "Description" to descrip10,
            "Course Code" to code10)

        courseList.collection("courses").document().set(courseMap)
        courseList.collection("courses").document().set(courseMap2)
        courseList.collection("courses").document().set(courseMap3)
        courseList.collection("courses").document().set(courseMap4)
        courseList.collection("courses").document().set(courseMap5)
        courseList.collection("courses").document().set(courseMap6)
        courseList.collection("courses").document().set(courseMap7)
        courseList.collection("courses").document().set(courseMap8)
        courseList.collection("courses").document().set(courseMap9)
        courseList.collection("courses").document().set(courseMap10)
    }
}