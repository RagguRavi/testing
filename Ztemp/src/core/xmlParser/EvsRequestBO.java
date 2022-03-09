package core.xmlParser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlatformRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class EvsRequestBO {

	@XmlElement(name="Credentials")
	private EvsCredentials credentials;
	
	@XmlElement(name="CustomerReference")
	private String customerReference;
	
	@XmlElement(name="Identity")
	private EvsIdentifyBo entityBo;
	
	public EvsRequestBO() {}
	

	public EvsCredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(EvsCredentials credentials) {
		this.credentials = credentials;
	}

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	public EvsIdentifyBo getEntityBo() {
		return entityBo;
	}

	public void setEntityBo(EvsIdentifyBo entityBo) {
		this.entityBo = entityBo;
	}
}


@XmlRootElement(name = "Credentials")
@XmlAccessorType(XmlAccessType.FIELD)
class EvsCredentials {
	@XmlElement(name="Username")
	private String userName;
	
	@XmlElement(name="Password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

@XmlRootElement(name = "Identity")
@XmlAccessorType(XmlAccessType.FIELD)
class EvsIdentifyBo {
	@XmlElement(name="FirstName")
	private String firstName;
	
	@XmlElement(name="MiddleName")
	private String middleName;
	
	@XmlElement(name="LastName")
	private String lastName;
	
	@XmlElement(name="Street")
	private String address;
	
	@XmlElement(name="City")
	private String city;
	
	@XmlElement(name="State")
	private String state;
	
	@XmlElement(name="ZipCode")
	private String zip;
	
	@XmlElement(name="DateOfBirth")
	private String dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}