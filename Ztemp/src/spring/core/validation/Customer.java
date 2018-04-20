package spring.core.validation;

public class Customer {

	int cid;
	String customerName;
	

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

	
	{
		System.out.println("------IIB Customer-------");
	}
	
}
