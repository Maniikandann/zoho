package Assignment3;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=s.nextInt();
		int f=1;
		for(int i=1;i<=a;i++) 
			f*=i;
		System.out.println(f);
			
		
	}

}