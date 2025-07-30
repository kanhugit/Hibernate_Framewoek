package org.jsp.spring;

public class AnimalSound {
	private Animal animal;
	
	
	public AnimalSound(Animal animal) {
		this.animal = animal;
	}


	public void doSound() {
		System.out.println("Animal Started Barking..");
		animal.sound();
	}
	
	
}
