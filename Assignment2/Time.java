package Assignment2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter time in seconds: ");
        int Seconds = s.nextInt();

        int hours = Seconds / 3600;
        int remainSeconds = Seconds % 3600;
        int minutes = remainSeconds / 60;
        int second = remainSeconds % 60;

    
        System.out.printf("Time in HH:mm:ss :" +hours +":"+ minutes+":"+ second);

 s.close();
    }
}
