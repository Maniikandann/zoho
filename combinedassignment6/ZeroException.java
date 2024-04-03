package combinedassignment6;

import java.util.Scanner;

public class ZeroException {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            double a = s.nextInt();

            System.out.print("Enter the denominator: ");
            double b = s.nextInt();
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            double result = a / b;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }
        s.close();
    }
}
