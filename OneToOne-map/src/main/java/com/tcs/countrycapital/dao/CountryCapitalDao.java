package com.tcs.countrycapital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tcs.capital.dto.Capital;
import com.tcs.country.dto.Country;

public class CountryCapitalDao {
	
	public void saveCountry(Country country) {
		if(country!=null) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager factory = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = factory.getTransaction();
		transaction.begin();
		factory.persist(country);
		transaction.commit();
		System.out.println("Country Saved Sucessfully");
		}else {
            System.out.println("Invalid country data. Cannot save.");
		}
	}
	
	
	
	public void saveCapital(Capital capital) {
		
		if(capital!=null) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager factory = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = factory.getTransaction();
		transaction.begin();
		factory.persist(capital);
		transaction.commit();
		System.out.println("Capital Saved sucessfully");
		}else {
            System.out.println("Invalid Capital data. Cannot save.");

		}
	}
	
	public void updateCountry(Country country) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		Country country_upd=entitymanager.find(Country.class,country.getCid());

		
		if(country_upd!=null) {
		transaction.begin();
		entitymanager.merge(country);
		transaction.commit();
		
		System.out.println("Country Updated Sucessfully..");
		}else {
            System.out.println("Country with ID " + country.getCid() + " does not exist.");
		}
	}
	
	public void updateCapital(Capital capital) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entitymanager.getTransaction();
		
		Capital capital_upd=entitymanager.find(Capital.class, capital.getCapId());
		if(capital_upd!=null) {
		transaction.begin();
		entitymanager.merge(capital);
		transaction.commit();
		System.out.println("Capital Updated Sucessfully..");

		}else {
            System.out.println("Capital with ID " + capital.getCapId() + " does not exist.");
		}
	}
	
	
	public void findCountryById(Country country) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		Capital country_find=entitymanager.find(Capital.class, country.getCid());

		
		if(country_find!=null) {
		transaction.begin();
		entitymanager.find(Country.class,country);
		transaction.commit();
		
        System.out.println("Country found: " + country_find);
		}else {
            System.out.println("Country with ID " + country + " not found.");
		}
	}
	
	


	public void findCapitalById(Capital capital) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		Capital capital_find=entitymanager.find(Capital.class, capital.getCapId());

		
		if(capital_find!=null) {
			transaction.begin();
			entitymanager.find(Country.class,capital);
			transaction.commit();
			
	        System.out.println("Capital found: " + capital_find);
			}else {
	            System.out.println("Capital with ID " + capital + " not found.");
			}
	
	}
	
	
	
	
	
	
	
	
	
	
	
//	public void deleteCountryById(Country country) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//		EntityManager factory = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = factory.getTransaction();
//		
//		
//		if(country!=null) {
//		transaction.begin();
//		factory.remove(null);
//		transaction.commit();
//		
//		System.out.println("Deleted  Sucessfully..");
//		}else {
//			System.out.println("Id does not exit..");
//		}
//	}
	
	

//	public void deleteCapitalById(Capital capital) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//		EntityManager factory = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = factory.getTransaction();
//		
//        Capital cap = factory.find(Capital.class, capital);
//        if(cap!=null) {
//        	transaction.begin();
//    		factory.remove(Capital.class);
//    		transaction.commit();
//            System.out.println("Capital with ID " + capital + " deleted successfully.");
//
//        }else {
//            System.out.println("Capital with ID " + capital + " not found.");
//
//        }
//		
//		
//	
//	}
//
//	

}
