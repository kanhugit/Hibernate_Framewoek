package in.kanhatech.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen1 = (Pen) context.getBean("Pen");
		pen1.write();
		pen1.close();
	}
}
