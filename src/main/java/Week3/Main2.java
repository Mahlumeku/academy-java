package Week3;

class Vehicle {
	public void startEngine() {
		System.out.println("Starting the engine...");
	}
}

class Car extends Vehicle {
	@Override
	public void startEngine() {
		System.out.println("Car engine started. Ready to go!");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.startEngine();

		Vehicle c2 = new Car();
		c2.startEngine();
	}
}
