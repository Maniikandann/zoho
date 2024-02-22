package Assignment2;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        double x= b * b - 4 * a * c;
        
        if (x >0) {
            double r1 = (-b + Math.sqrt(x)) / (2 * a);
            double r2 = (-b - Math.sqrt(x)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } 
        
        else if (x == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root 1 = Root 2 = " + root);
        } 
        
        else {
            double real = -b / (2 * a);
            double  r= Math.sqrt(-x) / (2 * a);
           
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1 = " + real + " + " + r+ "i");
            System.out.println("Root 2 = " + real+ " - " + r+ "i");
        }

        
    }
}
