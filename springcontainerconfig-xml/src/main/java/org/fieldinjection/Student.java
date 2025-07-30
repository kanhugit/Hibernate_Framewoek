package org.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("101")
    private int sid;

    @Value("kanha")
    private String name;

    @Value("Hyd")
    private String address;

    @Value("23")
    private int age;

    @Autowired
    private Bike bike; 

    public void details() {
        System.out.println(sid);
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        bike.bikeDetatil(); // Calling bike method
    }
}
