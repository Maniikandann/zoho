package combinedassignment6;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}

public class CustomExceptions {
	public static void main(String[] args) {
		try {
			int age = 22;
			if (age < 18) {
				throw new CustomException("Age must be 18 or above to register.");
			}
			System.out.println("Registration successful!");
		} catch (CustomException e) {

			System.out.println("Registration failed: " + e.getMessage());
		}
	}
}
