package spring.core;

public class Student {
	String studentName;
	int rollNo;
	public Student(String studentName, int rollNo) {
		this.studentName = studentName;
		this.rollNo = rollNo;
	}
	
	public Student() {
	
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
