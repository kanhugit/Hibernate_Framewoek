package org.education.universitystudent.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.education.student.dto.Student;
import org.education.university.dto.University;

public class UniversityStudentDao {

	private	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private	EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTranscation=entityManager.getTransaction();
	

    // **1. Save University (with Students)**
    public void saveUniversity(University university) {
		List<Student> listAccount=university.getStudents();

    	
        if (university.getStudents() != null) {
            for (Student student : university.getStudents()) {
                student.setUniversity(university);
            }
        }

        entityTranscation.begin();
        entityManager.persist(university);
        entityTranscation.commit();

        System.out.println("University and associated Students saved successfully.");
    }

    // **2. Save Student separately**
    public void saveStudent(Student student) {

    	entityTranscation.begin();
        entityManager.persist(student);
        entityTranscation.commit();

        System.out.println("Student saved successfully.");
    }

//    // **3. Add Students to an Existing University**
//    public void addStudentsToUniversity(int universityId, List<Student> students) {
//
//        University university = entityManager.find(University.class, universityId);
//
//        if (university != null) {
//        	entityTranscation.begin();
//
//            // Add new students to existing list
//            List<Student> existingStudents = university.getStudents();
//            existingStudents.addAll(students);
//
//            // Maintain bidirectional mapping
//            for (Student student : students) {
//                student.setUniversity(university);
//            }
//
//            entityManager.merge(university);
//            entityTranscation.commit();
//
//            System.out.println("Students added to University successfully.");
//        } else {
//            System.out.println("University not found.");
//        }
//    }

//    // **4. Find University by ID**
    public University findUniversityById(int universityId) {
        University university = entityManager.find(University.class, universityId);
        return university;
    }
    

//    // **5. Find Student by ID**
//    public Student findStudentById(int studentId) {
//        Student student = entityManager.find(Student.class, studentId);
//        return student;
//    }
//
//    // **6. Update University**
//    public void updateUniversity(University university) {
//
//        entityTranscation.begin();
//        entityManager.merge(university);
//        entityTranscation.commit();
//
//        System.out.println("University updated successfully.");
//    }
//
//    // **7. Delete University (and all associated Students)**
//    public void deleteUniversity(int universityId) {
//
//        University university = entityManager.find(University.class, universityId);
//        if (university != null) {
//        	entityTranscation.begin();
//            entityManager.remove(university);
//            entityTranscation.commit();
//
//            System.out.println("University deleted successfully.");
//        } else {
//            System.out.println("University not found.");
//        }
//    }
}

