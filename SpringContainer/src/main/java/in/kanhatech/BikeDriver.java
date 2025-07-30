package in.kanhatech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {

	public static void main(String[] args)  {
	ApplicationContext Context = new	ClassPathXmlApplicationContext("bike.xml");
		Bike bike = (Bike) Context.getBean("mybike1");
			bike.start();
			bike.stop();
		
		
		//Core container
//		ClassPathResource resource = new ClassPathResource("bike.xml");
//		BeanFactory factory=new XmlBeanFactory("resource");
//		Bike bike = (Bike) factory.getBean("mybike1");
//		bike.start();
//		bike.stop();
	}
}
