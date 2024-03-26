package combinedassignment3;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class ZsgsStudent extends Student {
	private String grade;

	public ZsgsStudent(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public ZsgsStudent(String name, String grade) {
		super(name, 0);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

public class Constructor {
	public static void main(String[] args) {
		ZsgsStudent child1 = new ZsgsStudent("Mani", 21, "A");
		System.out.println("Name: " + child1.getName());
		System.out.println("Age: " + child1.getAge());
		System.out.println("Grade: " + child1.getGrade());

		Student parent1 = new ZsgsStudent("Vicky", 22, "A+");
		System.out.println("Name: " + parent1.getName());
		System.out.println("Age: " + parent1.getAge());
		// System.out.println("Grade: " + parent1.getGrade()); // Compilation error, not accessible
	}
}
