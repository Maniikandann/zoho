package combinedassignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MissMatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your phone number: ");
			long phoneNumber = scanner.nextLong();
			System.out.println("Phone number entered: " + phoneNumber);
		} catch (InputMismatchException e) {
			System.out.println("Error: Invalid input! Please enter a valid phone number.");
		}
		scanner.close();
	}
}
