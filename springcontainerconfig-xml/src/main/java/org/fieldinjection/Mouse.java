package org.fieldinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mouse {

    @Value(value="Logitech") // Injecting string value
    private String brand;

    @Value(value="Wireless") // Injecting string value
    private String type;

    public Mouse(@Value("Logitech") String brand, @Value("Wireless") String type) {
        this.brand = brand;
        this.type = type;
    }

    public void mouseDetails() {
        System.out.println("Mouse Brand: " + brand);
        System.out.println("Mouse Type: " + type);
    }
}
