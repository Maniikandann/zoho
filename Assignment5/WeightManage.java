package Assignment5;

import java.util.Scanner;

public class WeightManage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of persons (N): ");
        int N = s.nextInt();


        int[][] weights = new int[N][];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weights for persons " + (i + 1) + ": ");
            int numWeights = s.nextInt();
            weights[i] = new int[numWeights];

            System.out.println("Enter weights for person " + (i + 1) + ": ");
            for (int j = 0; j < numWeights; j++) {
                weights[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter the person number (1 to " + N + "): ");
        int personNumber = s.nextInt();
        System.out.println("Minimum weight of person " + personNumber + ": " + findMinimumWeight(weights, personNumber - 1));

      
    }

    public static void enterWeight(int[][] weights, int personNumber, int weight) {
        if (personNumber >= 0 && personNumber < weights.length) {
        	
            int[] personWeights = weights[personNumber];
            
            int[] newWeights = new int[personWeights.length + 1];
           
            System.arraycopy(personWeights, 0, newWeights, 0, personWeights.length);
            
            newWeights[personWeights.length] = weight;
            
            weights[personNumber] = newWeights;
            
            System.out.println("Weight " + weight + " added for person " + (personNumber + 1));
        } 
        else {
            System.out.println("Invalid person number");
        }
    }

    public static int findMinimumWeight(int[][] weights, int personNumber) {
        if (personNumber >= 0 && personNumber < weights.length) {
            int minWeight = Integer.MAX_VALUE;
            
            for (int weight : weights[personNumber]) {
                
            	if (weight < minWeight) {
                	minWeight = weight;
                }
            }
            return minWeight;
        } 
        else {
            return -1;
        }
    }
}

