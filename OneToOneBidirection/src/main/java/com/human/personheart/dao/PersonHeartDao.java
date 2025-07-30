package com.human.personheart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.human.heart.dto.Heart;
import com.human.person.dto.Person;

public class PersonHeartDao {

	public void savePerson(Person person) {
		if (person != null) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			System.out.println("Person data saved successfully.");

		} else {
			System.out.println("Invalid pesron data. Cannot updated.");
		}
	}

	public void saveHeart(Heart heart) {

		if (heart != null) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(heart);
			entityTransaction.commit();
			System.out.println("Heart data saved successfully.");

		} else {
			System.out.println("Invalid Heart data. Cannot save.");
		}

	}
	
	
	public void updatePerson(Person person) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Heart person_upd=entityManager.find(Heart.class,person.getPersonId());
		if(person_upd!=null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			System.out.println("Person data Updated successfully.");

		}else {
			System.out.println("Invalid pesron data. Cannot save.");
		}

		
	
}

	public void updateHeart(Heart heart) {
		

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			Heart heart_upd=entityManager.find(Heart.class,heart.getHid());
			
			if(heart_upd!=null) {
				entityTransaction.begin();
				entityManager.merge(heart);
				entityTransaction.commit();
				System.out.println("Heart data Updated successfully.");

			}else {
				System.out.println("Invalid heart data. Cannot update.");
			}
			
	}
	public void findPersonById(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		Person person_find=entitymanager.find(Person.class, personId);

		
		if(person_find!=null) {
		entitymanager.find(Person.class,personId);
		
        System.out.println("Pesron found: " + person_find);
		}else {
            System.out.println("Person with ID " + personId + " not found.");
		}
	}
	
	public void findHeartById(int hid) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		Person heart_find=entitymanager.find(Person.class, hid);

		
		if(heart_find!=null) {
		
        System.out.println("Heart found: " + heart_find);
		}else {
            System.out.println("Heart with ID " + hid + " not found.");
		}
	}
	
	public void fetchPerson() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		Query query=entitymanager.createQuery("select p from Person p");
		List resultList = query.getResultList();

	}
	
	
	
	public void deletePersonById(int personId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		Person person_find=entitymanager.find(Person.class, personId);

		
		if(person_find!=null) {
		transaction.begin();
		entitymanager.remove(personId);
		transaction.commit();
		
        System.out.println("person found: " + person_find);
		}else {
            System.out.println("Person with ID " + personId + " not found.");
		}
	}
	
	public void deleteHeartById(int HeartId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		Person person_find=entitymanager.find(Person.class, HeartId);

		
		if(person_find!=null) {
		transaction.begin();
		entitymanager.remove(HeartId);
		transaction.commit();
		
        System.out.println("person found: " + person_find);
		}else {
            System.out.println("Person with ID " + HeartId + " not found.");
		}
	}
	
	
}
