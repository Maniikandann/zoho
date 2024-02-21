package Assignment1;

import java.util.Scanner;

public class WeekDayUseEnum {

	enum Weekday {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weekDays Number(1-7) ");

		int day = s.nextInt();
		if (day >= 1 && day <= 7) {
			Weekday weekday = Weekday.values()[day - 1];
			System.out.println("It's " + weekday);
		} else {
			System.out.println("Check the Input Value!");
		}
		s.close();

	}

}
