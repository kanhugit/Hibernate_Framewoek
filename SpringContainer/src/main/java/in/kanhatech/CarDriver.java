package in.kanhatech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext Context = new	ClassPathXmlApplicationContext("car.xml");
		Car car = (Car) Context.getBean("mycar1");
//		Car car = (Car) Context.getBean(Car.class);

		car.start();
		car.stop();
	}
}
