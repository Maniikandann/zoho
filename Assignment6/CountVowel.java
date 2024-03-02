package Assignment6;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x= s.nextLine();
        
        x = x.toLowerCase();
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }  
    }
        System.out.println("Total vowels is: " + count);
    }}