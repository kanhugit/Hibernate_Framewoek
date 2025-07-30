package in.kanhatech.injection;

public class Car {

		private String brand;
		private String color;
		private double price;
		
		private Engine engine;

		public Car(String brand, String color, double price, Engine engine) {
			this.brand = brand;
			this.color = color;
			this.price = price;
			this.engine = engine;
		}
		
		public void drive() {
			System.out.println("Joureny Stareted..");
		}

		@Override
		public String toString() {
			return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
		}
		
		
		
		
}
