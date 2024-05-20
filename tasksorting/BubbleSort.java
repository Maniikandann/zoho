package tasksorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 23, 1, 98, 22 };

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int a : arr) {
			System.out.print(a+" ");
		}
	}
}
