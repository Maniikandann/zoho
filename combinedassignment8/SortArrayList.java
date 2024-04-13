package combinedassignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   
    public String toString() {
        return "Student{" +"name='" + name + '\'' +  ", age=" + age + "}";
    }
}

class AgeComparator implements Comparator<Student> {
    
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 18));
        students.add(new Student("Charlie", 22));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new AgeComparator());

        System.out.println("\nAfter sorting by age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
