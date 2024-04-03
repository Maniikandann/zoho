package combinedassignment5.com.university.faculty;

public class Faculty {
	private String facultyId;
	private String name;
	private String department;

	public Faculty(String facultyId, String name, String department) {
		this.facultyId = facultyId;
		this.name = name;
		this.department = department;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
