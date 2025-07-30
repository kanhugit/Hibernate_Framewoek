package org.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSoundDriver {
	public static void main(String[] args) {
//	private	AnimalSound animalsound;
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Cat cat = (Cat) context.getBean("cat");
		Dog dog = (Dog) context.getBean("dog");
		
//		cat.sound();
//		cat.dowork();
		
		dog.sound();
	}
}
