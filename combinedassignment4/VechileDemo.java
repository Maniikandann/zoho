package combinedassignment4;

class Vehicle {
	public void start() {
		System.out.println("Vehicle started.");
	}

	public void stop() {
		System.out.println("Vehicle stopped.");
	}
}

class Car extends Vehicle {

	public void start() {
		System.out.println("Car started.");
	}

	public void stop() {
		System.out.println("Car stopped.");
	}
}

class Motorcycle extends Vehicle {

	public void start() {
		System.out.println("Motorcycle started.");
	}

	public void stop() {
		System.out.println("Motorcycle stopped.");
	}
}

public class VechileDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();

		v.start();
		v.stop();

		System.out.println();
		v = new Motorcycle();
		v.start();
		v.stop();
	}
}
