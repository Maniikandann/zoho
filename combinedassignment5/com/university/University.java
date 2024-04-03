package combinedassignment5.com.university;

import combinedassignment5.com.university.course.Course;
import combinedassignment5.com.university.faculty.Faculty;
import combinedassignment5.com.university.student.Student;

public class University {
	
	    public static void main(String[] args) {
	        // Creating a student
	        Student student = new Student("822219104020", "Manikandan", 22, "Computer Science");

	        // Creating a course
	        Course course = new Course("CS8651", "Internet Programing", 3);

	        // Creating a faculty member
	        Faculty faculty = new Faculty("F001", "Dr. Sathesh", "Computer Science");

	        // Output some information
	        System.out.println("Student: " + student.getName());
	        System.out.println("Course: " + course.getName());
	        System.out.println("Faculty Member: " + faculty.getName());
	    }
	
}
