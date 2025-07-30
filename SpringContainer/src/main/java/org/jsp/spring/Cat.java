package org.jsp.spring;

public class Cat implements Animal {
	
	private String color;
	private String name;
	
	
	public Cat(String color, String name) {
		this.color = color;
		this.name = name;
	}


	@Override
	public void sound() {
		System.out.println("Cat is Barking like Meow.... Meow..");
	}
}
