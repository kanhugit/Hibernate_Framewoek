package com.amazon.customerproduct.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.customer.dto.Customer;
import com.amazon.customerproduct.dao.CustomerProductDao;
import com.amazon.product.dto.Product;

public class CustomerProductController {
	
	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		customer1.setCustomerName("Kanha");
		customer1.setMob(8112146097L);
		customer1.setAddres("Odisha,Bdk,756132");
		
		Customer customer2=new Customer();
		customer2.setCustomerName("Balaram");
		customer2.setMob(7377262818L);
		customer2.setAddres("Ap,titili,756100");
		
		
		Product product1=new Product();
		product1.setProductName("Iphone-16");
		product1.setDescription("128 GB Navy Blue with 20MP");
		
		Product product2=new Product();
		product2.setProductName("Formal Dress");
		product2.setDescription(" Navy Blue Cotton style");
		
		
		
		List<Product> products=new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		
		customer1.setProducts(products);
		customer2.setProducts(products);
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		
		
		
		CustomerProductDao dao=new CustomerProductDao();
		dao.saveCustomer(customer1);
		dao.saveCustomer(customer2);
		dao.saveProduct(product1);
//		dao.saveProduct(product2);
		
		
	}
}
