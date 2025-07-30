package org.fieldinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charger {
    
    @Value(value="Dell Charger") // Injecting string value
    private String brand;

    @Value(value="65") // Injecting integer value
    private int watt;

    public Charger(@Value("Dell Charger") String brand, @Value("65") int watt) {
        this.brand = brand;
        this.watt = watt;
    }

    public void chargerDetails() {
        System.out.println("Charger Brand: " + brand);
        System.out.println("Power: " + watt + "W");
    }
}

