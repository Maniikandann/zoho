package Assignment3;

import java.util.*;

public class MonthAndYear {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = s.nextInt();

		System.out.println("Enter the year: ");
		int year = s.nextInt();

		boolean leapyear = year % 4 == 0;

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31 Days");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 Days");
			break;
		case 2:
			if (leapyear)
				System.out.println("29 Days");
			else
				System.out.println("28 Days");
			break;

		}

	}
}
