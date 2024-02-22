package Assignment2;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Please enter your weight in kilograms (kg): ");
		double w = s.nextDouble();

		System.out.print("Please enter your height in centmeters(cm): ");
		double cm = s.nextDouble();
		
		double m=cm/100;

		double bmi = w / (m * m);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} 
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal weight");
		} 
		else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
		} 
		else {
			System.out.println("Obesity");
		}

		System.out.println("Your Body Mass Index (BMI) is: " + bmi);

	}

}
