package org.animal;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    
    private String color;
    private String name;

    // Constructor Injection using @Value
    public Cat(@Value("White") String color, @Value("Snowy") String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + " (Color: " + color + ") is Meowing... Meow Meow...");
    }
}

