package org.education.universitystudent.controller;


import java.util.ArrayList;
import java.util.List;

import org.education.student.dto.Student;
import org.education.university.dto.University;
import org.education.universitystudent.dao.UniversityStudentDao;

public class UniversityStudentController {
    public static void main(String[] args) {

        // ====================== CASE 1: Saving University with Students ======================
        University university = new University();
        university.setUniversityName("Harvard University");

        Student student1 = new Student();
        student1.setStudentName("Alice");
        student1.setStudentCourse("Computer Science");

        Student student2 = new Student();
        student2.setStudentName("Bob");
        student2.setStudentCourse("Data Science");

        // Bidirectional Mapping
        student1.setUniversity(university);
        student2.setUniversity(university);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        university.setStudents(studentList);

        UniversityStudentDao dao = new UniversityStudentDao();

        // Save the University and Students together
//        dao.saveUniversity(university);

        // ====================== : Saving Student Independently ======================
//        Student student3 = new Student();
//        student3.setStudentName("Charlie");
//        student3.setStudentCourse("Mechanical Engineering");

//        // Fetch the university from DB and set the relation
//        University existingUniversity = dao.findUniversityById(101);
//        student3.setUniversity(existingUniversity);
//
//        // Save the student separately
//        dao.saveStudent(student3);
//
//        // ======================  Fetch University and Display Students ======================
        University foundUniversity = dao.findUniversityById(1);
        System.out.println("University Found: " + foundUniversity);
        System.out.println("Students: " + foundUniversity.getStudents());

        // ======================  Fetch Student and Display University ======================
//        Student foundStudent = dao.findStudentById(201);
//        System.out.println("Student Found: " + foundStudent);
//        System.out.println("Belongs to University: " + foundStudent.getUniversity());
//
//        // ====================== Add More Students to an Existing University ======================
//        Student student4 = new Student();
//        student4.setStudentName("David");
//        student4.setStudentCourse("Artificial Intelligence");
//
//        List<Student> newStudents = new ArrayList<>();
//        newStudents.add(student4);
//
////        dao.addStudentsToUniversity(101, newStudents);
    }
}
