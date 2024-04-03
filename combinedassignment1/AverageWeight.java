package combinedassignment1;

import java.util.Scanner;

public class AverageWeight{
    public static void Main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the weights of 10 people:");

        double totalWeight = 0;
        final int numberOfPeople = 10;
        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Weight of person " + i + ": ");
            double weight =s.nextDouble();
            totalWeight += weight;
        }
        double averageWeight =  totalWeight / numberOfPeople;

        System.out.println("Average weight of the 10 people is : " + averageWeight);

    }
}
 