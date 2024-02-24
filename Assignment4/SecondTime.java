package Assignment4;

public class SecondTime {
    public static int findSecondOccurrenceIndex(int[] arr, int num) {
        int firstIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 8, 7};
        int number = 2;
        
        
        int secondIndex = findSecondOccurrenceIndex(array, number);
        System.out.println("Index of the second occurrence of 2 is " + secondIndex);
    }
}


