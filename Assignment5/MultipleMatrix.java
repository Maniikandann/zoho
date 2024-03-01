package Assignment5;

import java.util.Scanner;

public class MultipleMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the how many rows: ");
		int r = s.nextInt();

		System.out.print("Enter the how many colums: ");
		int c = s.nextInt();

		System.out.println("Enter the value of 'A' matrix row & colums");

		int[][] v1 = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				v1[i][j] = s.nextInt();

		System.out.println("Enter the value of 'B' matrix row & colums");

		int[][] v2 = new int[r][c];

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				v2[i][j] = s.nextInt();
		System.out.println("Multiple of A and B matrix:");
		int[][] m = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m[i][j] = 0;
				for (int k = 0; k < r; k++) {
					m[i][j] += v1[i][k] * v2[k][j];
				}
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
