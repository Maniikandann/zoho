package Assignment3;
import java.util.*;
public class Tables {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the table number");
	
	int a=s.nextInt();
	System.out.println("Multiplication Table for " + a + ":");
	for(int i=1;i<=10;i++) {
		int result=a*i;
		System.out.println(i+"x"+a+"="+result);
	}
}
}
