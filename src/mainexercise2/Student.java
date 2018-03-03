package mainexercise2;

public class Student extends Person {
	private String classStatus;

	public Student() {
	}

	public String getClassStatus() {
		return this.classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	@Override
	public String toString() {
		return "Student: " + name;
	}

}
