package org.jsp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("");
		Food food = (Food) context.getBean("myconfig");
		
	}
}
