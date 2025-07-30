package org.animal;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.animal") // Scanning all @Component classes
public class Myconfig {
	
}

