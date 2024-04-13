package combinedassignment8;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPerform {

	public static void main(String[] args) {
		final int maxSize = 1000000;
		final int iterations = 100000;

		testAddPerformance(1000, iterations);
		testAddPerformance(maxSize / 10, iterations);
		testAddPerformance(maxSize, iterations);
	}

	public static void testAddPerformance(int capacity, int iterations) {
		ArrayList<Integer> arrayList = new ArrayList<>(capacity);
		Random random = new Random();
		long startTime = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			arrayList.add(random.nextInt());
		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Adding " + iterations + " elements to ArrayList with capacity " 
		+ capacity + ": "+ totalTime + " nanoseconds");
	}
}
