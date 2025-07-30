package in.kanhatech.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carinjection.xml");
		Mobile mobile = (Mobile) context.getBean("");
		mobile.watch();
	}
}
