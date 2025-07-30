package org.jsp.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.employee.dto.Employee;

public class EmployeeDao {
    
    // Save Employee
    public void saveEmployee(Employee employee) {
    	
        if (employee != null) {
        	
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(employee);
            entityTransaction.commit();
            System.out.println("Employee saved successfully.");

        } else {
            System.out.println("Invalid employee data. Cannot save.");
        }
    }

    // Update Employee
    public void updateEmployee(Employee employee) {
        
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            Employee existingEmployee = entityManager.find(Employee.class, employee.getId());
		            if (existingEmployee != null) {
		                entityManager.merge(employee);
		                entityTransaction.commit();
		                System.out.println("Employee updated successfully.");
		            } else {
		                System.out.println("Employee with ID " + employee.getId() + " does not exist.");
		            }
         
               
    }

    // Delete Employee by ID
    public void deleteEmployeeById(int empId) {
        
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            Employee employee = entityManager.find(Employee.class, empId);
	            if (employee != null) {
	                entityManager.remove(employee);
	                entityTransaction.commit();
	                System.out.println("Employee with ID " + empId + " deleted successfully.");
	            } else {
	                System.out.println("Employee with ID " + empId + " not found.");
	            }
            
    } 

    // Find Employee by ID
    public void findEmployeeById(int empId) {
        
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            Employee employee = entityManager.find(Employee.class, empId);
            
            
            if (employee != null) {
                System.out.println("Employee found: " + employee);
            } else {
                System.out.println("Employee with ID " + empId + " not found.");
            }

            
       
    }
}
