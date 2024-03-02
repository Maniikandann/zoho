package Assignment6;

import java.util.Scanner;

public class ReverseChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = s.nextLine();
   
        
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        String reversed = new String(charArray);
        
        System.out.println("Reversed string: " + reversed);
    }
}

