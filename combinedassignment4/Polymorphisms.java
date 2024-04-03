package combinedassignment4;

class Employee {
	private String name;
	private int employeeId;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
	}
}

class HourlyEmployee extends Employee {
	private double hourlyRate;

	public HourlyEmployee(String name, int employeeId, double hourlyRate) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
	}

	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Hourly Rate: $" + hourlyRate);
	}
}

class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(String name, int employeeId, double salary) {
		super(name, employeeId);
		this.salary = salary;
	}

	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Salary: $" + salary);
	}
}

public class Polymorphisms {
	public static void main(String[] args) {

		Employee employee1 = new HourlyEmployee("Mani", 1001, 20.0);
		Employee employee2 = new SalariedEmployee("Prakash", 1002, 50000.0);

		System.out.println("Employee 1 Details:");
		employee1.getEmployeeDetails();
		System.out.println("\nEmployee 2 Details:");
		employee2.getEmployeeDetails();
	}
}
