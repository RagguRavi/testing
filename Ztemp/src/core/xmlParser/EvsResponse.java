package core.xmlParser;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlatformResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class EvsResponse {
	
	@XmlElement(name="TransactionDetails")
	public  TransactionDetails transactionDetails;

	public TransactionDetails getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	
	
}

@XmlRootElement(name = "TransactionDetails")
@XmlAccessorType(XmlAccessType.FIELD)
class TransactionDetails {
	
	@XmlElementWrapper(name="Errors")
	@XmlElement(name="Error")
	public List<Error> errors;

	@XmlElement(name="Product",nillable = true)
	public Product product;
	
	@XmlElement(name = "TransactionDate")
	private String transactionDate;

	
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "TransactionDetails [errors=" + errors + ", product=" + product + ", transactionDate=" + transactionDate
				+ "]";
	}

	
	
}


@XmlRootElement(name = "Error")
@XmlAccessorType(XmlAccessType.PROPERTY)
class Error {
	@XmlAnyAttribute
	public Map<String,String> attr;
	
	@XmlAttribute
	public String code;

	@Override
	public String toString() {
		return "Error [attr=" + attr + ", code=" + code + "]";
	}
	
	
	
	
}

@XmlAccessorType(XmlAccessType.PROPERTY)
class Product {
	@XmlAnyAttribute
	public Map<String,String> attr;
}





