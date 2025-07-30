package com.educationstudentcourse.controller;

import java.util.ArrayList;
import java.util.List;

import com.education.course.dto.Course;
import com.education.student.dto.Student;
import com.educationstudentcourse.dao.StudentCourseDao;

public class StudentCourseController {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentName("Rahul");
        student1.setMobile(9876543210L);
        student1.setAddress("Delhi, India");

        Student student2 = new Student();
        student2.setStudentName("Sneha");
        student2.setMobile(8765432109L);
        student2.setAddress("Mumbai, India");

        Course course1 = new Course();
        course1.setCourseName("Mathematics");
        course1.setDescription("Advanced Algebra and Calculus");

        Course course2 = new Course();
        course2.setCourseName("Physics");
        course2.setDescription("Mechanics and Thermodynamics");

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        student1.setCourses(courses);
        student2.setCourses(courses);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        course1.setStudents(students);
        course2.setStudents(students);

        StudentCourseDao dao = new StudentCourseDao();
        dao.saveStudent(student1);
        dao.saveStudent(student2);
        dao.saveCourse(course1);
    }
}
