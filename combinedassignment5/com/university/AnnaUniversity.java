package combinedassignment5.com.university;

import combinedassignment5.com.university.course.Course;
import combinedassignment5.com.university.faculty.Faculty;
import combinedassignment5.com.university.student.Student;

public class AnnaUniversity {

	public static void main(String[] args) {

		Student student = new Student("822219104020", "Manikandan", 22, "Computer Science");

		Course course = new Course("CS8651", "Internet Programing", 3);

		Faculty faculty = new Faculty("F001", "Dr.Sathesh", "Computer Science");

		System.out.println("Student: " + student.getName());
		System.out.println("Course: " + course.getName());
		System.out.println("Faculty Member: " + faculty.getName());
	}

}
