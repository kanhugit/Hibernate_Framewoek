package org.animal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dog implements Animal {
    
    private String color;
    private String name;

    // Constructor Injection using @Value
    public Dog(@Value("Brown") String color, @Value("Bruno") String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + " (Color: " + color + ") is Barking... Woof Woof...");
    }
}

