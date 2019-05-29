package httpRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AddressValidateRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressValidateRequest {

	@XmlAttribute(name="USERID")
	private  String USERID;
	
	@XmlElement(name="Address")
	private Address Address;


	public AddressValidateRequest() {}


	public AddressValidateRequest(String uSERID, Address address) {
		super();
		USERID = uSERID;
		Address = address;
	}


	public String getUSERID() {
		return USERID;
	}


	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}


	public Address getAddress() {
		return Address;
	}


	public void setAddress(Address address) {
		Address = address;
	}

	

	
}
