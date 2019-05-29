package spring.AOP.aspectjAnnotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank implements MyCheckingInterface {

	int amount = 5000;
	String accountNo = "sbi1";

	public int deposite(int amount, String accountNO) throws AccountNoNotFount {
		System.out.println("---------Deposite methode--------");
		Log l = LogFactory.getLog(this.getClass());
		l.warn(amount + "\t" + accountNO);
		if (accountNO.equals(this.accountNo)) {

			this.amount = amount + this.amount;
			return this.amount;
		} else {
			throw new AccountNoNotFount();
		}
	}

	public int getAmount(int accountNO) {
		System.out.println("-------Get Ammount Method------");
		return 209000;
	}
	
	public String checkIt(int a ,Customer customer,int b) {
		System.out.println("-----------this checking of custoer ------");
		return customer.toString();
	}
	public String checkIt1(int a ,Customer customer) {
		System.out.println("-----------this checking1 of custoer ------");
		return customer.toString();
	}
	public String checkIt2(Customer customer,int b) {
		System.out.println("-----------this checking2 of custoer ------");
		return customer.toString();
	}
	
	public String checkIt3(Customer customer) {
		System.out.println("-----------this checking3 of custoer ------");
		return customer.toString();
	}
}
