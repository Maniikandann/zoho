package combinedassignment5.com.university.student;

public class Student {
	private String studentId;
	private String name;
	private int age;
	private String department;

	public Student(String studentId, String name, int age, String department) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
