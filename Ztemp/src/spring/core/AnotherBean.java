package spring.core;

public class AnotherBean {
	Student student;
	WeekendStudent weekendStudent;

	public AnotherBean(Student student, WeekendStudent weekendStudent) {

		this.student = student;
		this.weekendStudent = weekendStudent;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public WeekendStudent getWeekendStudent() {
		return weekendStudent;
	}

	public void setWeekendStudent(WeekendStudent weekendStudent) {
		this.weekendStudent = weekendStudent;
	}

	@Override
	public String toString() {
		return "AnotherBean [student=" + student + ", weekendStudent=" + weekendStudent + "]";
	}

}
