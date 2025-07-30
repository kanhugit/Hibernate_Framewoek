package com.tcs.personpassport.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tcs.passport.dto.Passport;
import com.tcs.person.dto.Person;

public class PersonPassportDao {

    // Method to save a person in the database
    public void savePerson(Person person) {
        if (person != null) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager manager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = manager.getTransaction();

            transaction.begin();  // Start the transaction
            manager.persist(person);  // Save the person entity
            transaction.commit();  // Commit the transaction

            System.out.println("Person saved successfully");
        } else {
            System.out.println("Invalid person data. Cannot save.");
        }
    }

    // Method to save a passport in the database
    public void savePassport(Passport passport) {
        if (passport != null) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager manager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = manager.getTransaction();

            transaction.begin();
            manager.persist(passport);
            transaction.commit();

            System.out.println("Passport saved successfully");
        } else {
            System.out.println("Invalid passport data. Cannot save.");
        }
    }

    // Method to update a person in the database
    public void updatePerson(Person person) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Person personToUpdate = manager.find(Person.class, person.getPersonId());

        if (personToUpdate != null) {
            transaction.begin();
            manager.merge(person);  // Update the person entity
            transaction.commit();

            System.out.println("Person updated successfully");
        } else {
            System.out.println("Person with ID " + person.getPersonId() + " does not exist.");
        }
    }

    // Method to update a passport in the database
    public void updatePassport(Passport passport) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        Passport passportToUpdate = manager.find(Passport.class, passport.getPassportId());

        if (passportToUpdate != null) {
            transaction.begin();
            manager.merge(passport);  // Update the passport entity
            transaction.commit();

            System.out.println("Passport updated successfully");
        } else {
            System.out.println("Passport with ID " + passport.getPassportId() + " does not exist.");
        }
    }

    // Method to find a person by ID
    public void findPersonById(int personId) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = entityManagerFactory.createEntityManager();

        Person personFound = manager.find(Person.class, personId);

        if (personFound != null) {
            System.out.println("Person found: " + personFound.getName());
        } else {
            System.out.println("Person with ID " + personId + " not found.");
        }
    }

    // Method to find a passport by ID
    public void findPassportById(int passportId) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = entityManagerFactory.createEntityManager();

        Passport passportFound = manager.find(Passport.class, passportId);

        if (passportFound != null) {
            System.out.println("Passport found: " + passportFound.getPassportNumber());
        } else {
            System.out.println("Passport with ID " + passportId + " not found.");
        }
    }

    // Uncomment and complete these methods if you want to implement deletion logic

//    public void deletePersonById(int personId) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//        EntityManager manager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = manager.getTransaction();
//
//        Person person = manager.find(Person.class, personId);
//        if (person != null) {
//            transaction.begin();
//            manager.remove(person);
//            transaction.commit();
//            System.out.println("Person deleted successfully");
//        } else {
//            System.out.println("Person with ID " + personId + " not found.");
//        }
//    }

//    public void deletePassportById(int passportId) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//        EntityManager manager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = manager.getTransaction();
//
//        Passport passport = manager.find(Passport.class, passportId);
//        if (passport != null) {
//            transaction.begin();
//            manager.remove(passport);
//            transaction.commit();
//            System.out.println("Passport deleted successfully");
//        } else {
//            System.out.println("Passport with ID " + passportId + " not found.");
//        }
//    }
}

