package org.jsp.employee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private String Address;
	private double Salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double i) {
		Salary = i;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + ", Salary=" + Salary + "]";
	}
	
}
