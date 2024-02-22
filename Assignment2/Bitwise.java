package Assignment2;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

       
        int AND = a & b;
        System.out.println("AND: " + AND);

        
        int OR = a|b;
        System.out.println("OR: " + OR);

        
        int XOR = a ^ b;
        System.out.println("XOR: " + XOR);

        
        int ls1 = a<< 1; 
        System.out.println("Left shift of a: " + ls1);
        
        int ls2 = b<< 1; 
        System.out.println("Left shift of b: " + ls2);

        
        int rs1 = a>> 1; 
        System.out.println("Right shift of a: " + rs1);
        
        int rs2 = b>> 1; 
        System.out.println("Right shift of b: " + rs2);

        scanner.close();
    }
}
