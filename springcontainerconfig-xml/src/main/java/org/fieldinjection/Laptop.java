package org.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private int id;
    private String brand;
    private String color;
    private String processor;
    private Mouse mouse;

    @Autowired // Correctly placed here
    public Laptop(
        @Value("1001") int id,
        @Value("Dell") String brand,
        @Value("Black") String color,
        @Value("Intel i7") String processor,
        Mouse mouse) // No need for @Autowired here, it's handled above
    {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.processor = processor;
        this.mouse = mouse;
    }

    public void laptopDetails() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Processor: " + processor);
        System.out.println("Mouse: " + mouse);
    }
}
