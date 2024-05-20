package tasksorting;

public class InsertionSort { 
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
     
        System.out.println("Sorted array:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
