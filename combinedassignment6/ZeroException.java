package combinedassignment6;

import java.util.Scanner;

public class ZeroException {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        try {
	            System.out.print("Enter the numerator: ");
	            int a = s.nextInt();

	            System.out.print("Enter the denominator: ");
	            int b = s.nextInt();

	            int result = a/ b;
	            System.out.println("Result of division: " + result);
	            
	        } catch (Exception e) {
	            System.out.println("Error:Cannot divide by zero!");
	       
	        }
	        s.close();
	    }
	}


