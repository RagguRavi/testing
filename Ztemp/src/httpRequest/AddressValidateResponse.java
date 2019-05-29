package httpRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AddressValidateResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressValidateResponse {


	private Address Address;

	public AddressValidateResponse(Address address) {
		super();
		this.Address = address;
	}

	public AddressValidateResponse() {
		super();
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		this.Address = address;
	}

	@Override
	public String toString() {
		return "AddressValidateResponse [address=" + Address + "]";
	}



}
