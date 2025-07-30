package org.fieldinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Value(value="101")
	private int  id;
	
	@Value(value="KTM")
	private String brand;
	
	@Value(value="130")
	private int cc;
	
	
	
	public void bikeDetatil() {
		System.out.println(id);
		System.out.println(brand);
		System.out.println(cc);
		

		
	}
	
}
