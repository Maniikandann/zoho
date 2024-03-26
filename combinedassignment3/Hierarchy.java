package combinedassignment3;

abstract class Vehicle {
	private String make;
	private String model;
	private int year;

	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public abstract String getType();

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

class Car extends Vehicle {
	public Car(String make, String model, int year) {
		super(make, model, year);
	}

	public String getType() {
		return "Car";
	}
}

class Truck extends Vehicle {
	private int loadCapacity;

	public Truck(String make, String model, int year, int loadCapacity) {
		super(make, model, year);
		this.loadCapacity = loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public String getType() {
		return "Truck";
	}
}

public class Hierarchy {
	public static void main(String[] args) {
		Car car = new Car("BMW", "7Series", 2024);
		Truck truck = new Truck("Ford", "F-150", 2018, 5000);

		System.out.println("Car: " + car.getMake() + " " + car.getModel() + " " + car.getYear());
		System.out.println("Type: " + car.getType());

		System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " " + truck.getYear());
		System.out.println("Type: " + truck.getType());
		System.out.println("Load Capacity: " + truck.getLoadCapacity() + " lbs");
	}
}
