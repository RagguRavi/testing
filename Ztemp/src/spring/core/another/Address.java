package spring.core.another;

public class Address {
	String city;
	String state;
	String street;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String state, String street) {
			System.out.println("Address(String city, String state, String street)");
		this.city = city;
		this.state = state;
		this.street = street;
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
