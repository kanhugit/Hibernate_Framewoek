package com.amazon.customerproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.amazon.customer.dto.Customer;
import com.amazon.product.dto.Product;

public class CustomerProductDao {
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	private EntityManager em=emf.createEntityManager();
	private  EntityTransaction et=em.getTransaction();
	
	
	public void saveCustomer(Customer customer) {
		et.begin();
		em.persist(customer);
		et.commit();
	}
	
	public void saveProduct(Product product) {
		et.begin();
		em.persist(product);
		et.commit();
	}
	
}
