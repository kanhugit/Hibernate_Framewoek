package com.educationstudentcourse.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.education.course.dto.Course;
import com.education.student.dto.Student;

public class StudentCourseDao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();

    public void saveStudent(Student student) {
        et.begin();
        em.persist(student);
        et.commit();
    }

    public void saveCourse(Course course) {
        et.begin();
        em.persist(course);
        et.commit();
    }
}

