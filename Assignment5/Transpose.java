package Assignment5;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the how many rows");
		int r=s.nextInt();
		
		System.out.println("Enter the how many colums");
		int c=s.nextInt();
		
		System.out.println("Enter the value of row & colums");
		
		int[][]v=new int[r][c];
		
		for(int i=0;i<r;i++) 
		 for(int j=0;j<c;j++) 
			v[i][j]=s.nextInt();
		
		System.out.println("orginal matric");
		for(int i=0;i<r;i++) { 
			 for(int j=0;j<c;j++) {
				 System.out.print(v[i][j]+" ");
			 }
			 System.out.println();
			 
		}
				
		System.out.println("Transpose matric");
		for(int i=0;i<c;i++) { 
			 for(int j=0;j<r;j++) {
				 		 System.out.print(v[j][i]+" ");
			 }
			 System.out.println();
			 
		}
	
	}

}
