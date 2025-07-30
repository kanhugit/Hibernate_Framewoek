package in.kanhatech.injection;

public class Pen {
	private String name;
	private String color;
	private double price;
	
	public Pen(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void write() {
		System.out.println(" Pen started Writing..");
	}
	
	public void close() {
		System.out.println(" Pen closed..");
	}
	
	
}
