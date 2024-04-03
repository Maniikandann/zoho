package combinedassignment7;

import java.util.Scanner;

abstract class Employee {
	private String name;
	private int employeeId;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public abstract double calculatePay();

	public String getEmployeeDetails() {
		return "Name: " + name + ", Employee ID: " + employeeId;
	}
}

class HourlyEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;

	public HourlyEmployee(String name, int employeeId, double hourlyRate, double hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}
}

class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(String name, int employeeId, double salary) {
		super(name, employeeId);
		this.salary = salary;
	}

	public double calculatePay() {
		return salary;
	}
}

public class EmployeePayCals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter details for Hourly Employee:");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Employee ID: ");
		int employeeId = scanner.nextInt();
		System.out.print("Hourly Rate: ");
		double hourlyRate = scanner.nextDouble();
		System.out.print("Hours Worked: ");
		double hoursWorked = scanner.nextDouble();

		Employee hourlyEmployee = new HourlyEmployee(name, employeeId, hourlyRate, hoursWorked);

		System.out.println("\nEnter details for Salaried Employee:");
		scanner.nextLine();
		System.out.print("Name: ");
		name = scanner.nextLine();
		System.out.print("Employee ID: ");
		employeeId = scanner.nextInt();
		System.out.print("Salary: ");
		double salary = scanner.nextDouble();

		Employee salariedEmployee = new SalariedEmployee(name, employeeId, salary);

		System.out.println("\nEmployee Details and Pay:");
		System.out.println(hourlyEmployee.getEmployeeDetails() + ", Pay: $" + hourlyEmployee.calculatePay());
		System.out.println(salariedEmployee.getEmployeeDetails() + ", Pay: $" + salariedEmployee.calculatePay());

		scanner.close();
	}
}
