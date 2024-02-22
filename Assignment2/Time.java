package Assignment2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter time in seconds: ");
        int Seconds = s.nextInt();

        int hours = Seconds / 3600;
        int remainingSeconds = Seconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

    
        System.out.printf("Time in HH:mm:ss :" +hours +":"+ minutes+":"+ seconds);

 
    }
}
