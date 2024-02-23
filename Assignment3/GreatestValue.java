package Assignment3;
import java.util.Scanner;
public class GreatestValue {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a ");
	int a,b,c;
	 a=s.nextInt();
	 System.out.println("Enter the value of b "); 
	b=s.nextInt();
	System.out.println("Enter the value of c ");
	c=s.nextInt();
	
	if(a>b&&a>c)
		System.out.println("\""+"Greatest Value is a"+"\"");
	else if(b>a&&b>c)
		System.out.println("\""+"Greatest Value is b"+"\"");
	else
		System.out.println("\""+"Greatest Value is c"+"\"");
	
	  	 
}
}
