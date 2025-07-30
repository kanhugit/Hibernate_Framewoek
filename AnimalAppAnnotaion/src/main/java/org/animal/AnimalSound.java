package org.animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {

    private Animal animal;

    // Constructor Injection using @Autowired
    @Autowired
    
    public AnimalSound(@Qualifier(value="dog") Animal animal) {
        this.animal = animal;
    }

    public void doSound() {
        System.out.println("Animal is making a sound...");
        animal.sound();
    }
}

