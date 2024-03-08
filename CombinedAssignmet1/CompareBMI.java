package CombinedAssignmet1;

import java.util.Scanner;

public class CompareBMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number of People to Check the BMI: ");
		int x = s.nextInt();
		double lowBMI = Double.MAX_VALUE;
		System.out.println(lowBMI);
		String person = "";

		for (int i = 1; i <= x; i++) {
			System.out.print("Person " + i + " weight in kilograms (kg): ");
			double w = s.nextDouble();

			System.out.print("Person " + i + " height in centimeters (cm): ");
			double cm = s.nextDouble();

			System.out.println();
			double m = cm / 100;

			double bmi = w / (m * m);
			if (bmi < lowBMI) {
				lowBMI = bmi;
				person = "Person " + i;

			}
		}

		System.out.println("The person with the low  BMI is: " + person);

	}
}
