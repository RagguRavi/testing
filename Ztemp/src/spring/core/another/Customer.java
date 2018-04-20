package spring.core.another;

public class Customer {

	int cid;
	String customerName;
	
	Address address;

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customerName=" + customerName + ", address=" + address + "]";
	}

	public Customer(int cid, String customerName, Address address) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		this.address = address;
	}
	
	public Customer() {}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	{
		System.out.println("------IIB Customer-------");
	}
	
}
