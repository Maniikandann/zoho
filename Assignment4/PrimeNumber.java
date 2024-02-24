package Assignment4;

public class PrimeNumber {
	public static void main(String[] args) {
		int N = 30;

    System.out.println(" Prime numbers between 1 and 30");
		for (int x = 2; x <= N; x++) {
			int prime = 1;
          for (int y = 2; y <= x / 2; y++) {
				if (x % y == 0) {
					prime = 0;
					break;
				}
			}
			if (prime== 1)
				System.out.print(x + " ");
		}
	}
}
