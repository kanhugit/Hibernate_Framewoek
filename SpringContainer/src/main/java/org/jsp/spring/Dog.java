package org.jsp.spring;

public class Dog implements Animal{
	
	private String color;
	private String name;
	
	
	public Dog(String color, String name) {
		this.color = color;
		this.name = name;
	}


	@Override
	public void sound() {
		System.out.println("Dog is Barking like Bhoooo.. Bhoooo..");
	}

}
