package combinedassignment5.com.university.course;

public class Course {

	private String courseId;
	private String name;
	private int credits;

	public Course(String courseId, String name, int credits) {
		this.courseId = courseId;
		this.name = name;
		this.credits = credits;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}
