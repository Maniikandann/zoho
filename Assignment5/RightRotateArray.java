package Assignment5;

import java.util.*;

public class RightRotateArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Arrays");
		int size = s.nextInt();
		System.out.println("Enter the Value of  Array ");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = s.nextInt();

		System.out.println("Enter the Rotate count:");
		int r = s.nextInt();

		for (int i = 0; i < r; i++) {

			int last = arr[arr.length - 1];
			
			for (int j = arr.length - 1; j > 0; j--) {

				arr[j] = arr[j - 1]; 
			}
			arr[0] = last;
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
