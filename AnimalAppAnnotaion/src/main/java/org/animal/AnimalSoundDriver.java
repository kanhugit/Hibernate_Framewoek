package org.animal;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalSoundDriver {
    public static void main(String[] args) {
        // Creating ApplicationContext using AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

        // Getting the AnimalSound Bean
        AnimalSound animalSound = context.getBean(AnimalSound.class);

        System.out.println("\n--- Animal Sound ---");
        animalSound.doSound();
    }
}
