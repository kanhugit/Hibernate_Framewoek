package org.fieldinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringconfig.xml");

       // Student student = context.getBean(Student.class);
        //student.details(); // Now calls both Student and Bike details
        
        Laptop laptop = context.getBean(Laptop.class);
        laptop.laptopDetails();
        
    }
}
