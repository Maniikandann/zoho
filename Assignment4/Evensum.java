package Assignment4;

public class Evensum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sum = 0;
        for (int num : array) {
        	
            if (num % 2 != 0) {
                continue;
            }
            sum += num;
        
             }
		System.out.println("Sum of even numbers in the array: " + sum);
			}
		}
