
package Assignment5;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for(int i=0;i<rows;i++) { 
			 for(int j=0;j<columns;j++) {
				 System.out.print(matrix[i][j]+" ");
			 }
			 System.out.println();
        }

        int[] result = generateSpiral(matrix, rows, columns);
        System.out.println("Spiral Matrix:");
        printArray(result);

        
    }

    public static int[] generateSpiral(int[][] matrix, int rows, int columns) {
        int[] result = new int[rows * columns];
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            top++;

           
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;

           
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

         
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }

        return result;
    }

   

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
