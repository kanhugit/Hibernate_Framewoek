package org.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // Use ConfigurableApplicationContext instead of ApplicationContext
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("myspringconfig.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringconfig.xml");

        // Get the Car bean and call its method
        Car car = context.getBean(Car.class);
        car.carDetails();

        // Register a shutdown hook to call the @PreDestroy method automatically
       // context.registerShutdownHook();

        // Alternatively, you can manually close the context
         ((ConfigurableApplicationContext) context).close();  //  if you want manual closing
    }
}
