package org.setterinjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private int id;
	private String brand;
	private String color;
	private String price;
	
	 
	
	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getPrice() {
		return price;
	}

	// Setter methods with @Value annotations
	@Value("2001")
	public void setId(int id) {
		this.id = id;
	}

	@Value("Toyota")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value("Red")
	public void setColor(String color) {
		this.color = color;
	}

	@Value("25000")
	public void setPrice(String price) {
		this.price = price;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start ");
	}

	@PreDestroy
	public void end() {
		System.out.println("End");
	}
	// Method to display details
	public void carDetails() {
	  	System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
	}
}
