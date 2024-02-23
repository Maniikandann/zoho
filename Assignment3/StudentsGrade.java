package Assignment3;

import java.util.*;

public class StudentsGrade {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter the Tamil Mark out of 100:");
int tamil=s.nextInt();

System.out.println("Enter the English Mark out of 100:");
int english=s.nextInt();

System.out.println("Enter the Maths Mark out of 100:");
int maths=s.nextInt();

System.out.println("Enter the Science Mark out of 100:");
int science=s.nextInt();

System.out.println("Enter the SocialScience Mark out of 100:");
int social=s.nextInt();

if (tamil < 35 || english < 35 || maths < 35 || science < 35 || social < 35) {
	

	System.out.println("you are Fail");
}
else {

	 int total = tamil + english + maths + science + social;
    System.out.println("Total Mark is " + total);

    double grade= total / 5;


    if (grade>= 90) {
        System.out.println("Grade: A");
    } else if (grade>= 80) {
        System.out.println("Grade: B");
    } else if (grade >= 70) {
        System.out.println("Grade: C");
    } else if (grade>= 60) {
        System.out.println("Grade: D");
    } else {
        System.out.println("Grade: F");
}

}}}