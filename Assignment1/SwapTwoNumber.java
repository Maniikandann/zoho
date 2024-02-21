package Assignment1;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swap");
		System.out.println("a of the value is " + a + "\n" + "b of the value is " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap");
		System.out.print("a of the value is " + a + "\n" + "b of the value is " + b);

	}

}
