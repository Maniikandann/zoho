package Assignment6;
import java.util.*;
public class ReverseWord {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        
	        String input = s.nextLine();
	        

	        String[] words = input.split(" "); 

	        StringBuilder reversedSentence = new StringBuilder();
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedSentence.append(words[i]);
	            if (i != 0) {
	                reversedSentence.append(" "); 
	            }
	        }
	        System.out.println("Reversed sentence: " + reversedSentence);
	    }

	 
	}
