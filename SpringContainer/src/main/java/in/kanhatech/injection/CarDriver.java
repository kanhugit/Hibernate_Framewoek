package in.kanhatech.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carinjection.xml");
		Car car1 = (Car) context.getBean("drive");
		System.out.println(car1);
		car1.drive();
	}
}
