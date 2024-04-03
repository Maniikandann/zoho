package combinedassignment1;

public class ErrorCheck {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Outside the if block: " + a);

		if (a > 0) {
			int b = 20;
			System.out.println("Inside the if block: " + b);
			System.out.println("Outside the if block: " + a);
		}

// Print the value of the outside & Inside variable again
		System.out.println("Again, Outside the if block: " + a);
	// Error clear System.out.println("Again,Inside the if block: " + b);
		/*
		 * The above line causes a compiler error because the variable insideVariable is
		 * out of scope here.
		 */
	}
}
