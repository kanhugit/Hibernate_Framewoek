package com.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



class CarDriver {

	public static void main(String[] args) {
		 Car_wala c= new Car_wala();
		 c.setCid(104);
		 c.setColor("Blue");
		 c.setName("RR");
		 c.setPrice(30000000);
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 et.begin();
		 //save
		 em.persist(c);
		 et.commit();
		 //delete
		 em.remove(c);
		 
		 
	 }
}