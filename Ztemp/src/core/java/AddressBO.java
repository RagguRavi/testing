package core.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ravi
 *
 */
@XmlType(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressBO {
	@XmlAttribute(name="ID")
	private String ID;
	
	private String Address1;
	
	private  String Address2;
	
	private String City;
	
	private String State;
	
	private String Zip5;
	
	private String Zip4;



	public AddressBO() {
	}
	
	public AddressBO(String iD, String address1, String address2, String city, String state, String zip5, String zip4) {
		super();
		ID = iD;
		this.Address1 = address1;
		Address2 = address2;
		City = city;
		State = state;
		Zip5 = zip5;
		Zip4 = zip4;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip5() {
		return Zip5;
	}
	public void setZip5(String zip5) {
		Zip5 = zip5;
	}
	public String getZip4() {
		return Zip4;
	}
	public void setZip4(String zip4) {
		Zip4 = zip4;
	}

	@Override
	public String toString() {
		return "AddressBO [ID=" + ID + ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City
				+ ", State=" + State + ", Zip5=" + Zip5 + ", Zip4=" + Zip4 + "]";
	}
	
	
}
