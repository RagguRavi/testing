package hibernate.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int aid;
	@Column(name = "myCityName")
	String city;
	String state;
	String street;
	
	@ManyToOne
	Student student;
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address(int aid,String city, String state, String street,Student student) {
		System.out.println("Address(String city, String state, String street)");
		this.aid=aid;
		this.city = city;
		this.state = state;
		this.street = street;
		this.student = student;
	}

	public Address(String city, String state, String street,Student student) {
		System.out.println("Address(String city, String state, String street)");
		this.city = city;
		this.state = state;
		this.street = street;
		this.student=student;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", street=" + street + "]";
	}

	{
		System.out.println("address IIB");
	}
	static {
		System.out.println("--------IIB Address----------");
	}
}
