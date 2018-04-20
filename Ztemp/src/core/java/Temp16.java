package core.java;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTimeUtils;

public class Temp16 {
	public static void main(String[] args) {
		/*Student st = new Student(1, "a");
		Student st1 = new Student(2, "bb");
		Student st2 = new Student(3, "cc");
		Student st3 = new Student(4, "dd");
		Student st4 = new Student(5, "ee");
		
		List<Student> lst = Arrays.asList(st,st1,st2,st3,st4);
		
//		lst.stream().
*/	
		Date date1 = new Date();
		Date date2 = new Date();
		
		
	}
}


class Student {
	int rollNo;
	String name;
	
	public Student() {
		
	}
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}