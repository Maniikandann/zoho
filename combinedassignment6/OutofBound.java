package combinedassignment6;

public class OutofBound {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		try {
			System.out.println("Element at index 5: " + arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
