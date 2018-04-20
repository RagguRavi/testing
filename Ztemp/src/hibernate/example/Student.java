package hibernate.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="studentId")
	int sid;
	String studentName;
	int rollNo;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student")
	List<Address> address;
	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Student(int sid,String studentName, int rollNo) {
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
		return "Student [sid=" + sid + ", studentName=" + studentName + ", rollNo=" + rollNo + ", address=" + address
				+ "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
