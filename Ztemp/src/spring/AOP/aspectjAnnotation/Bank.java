package spring.AOP.aspectjAnnotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {

	int amount=5000;
	String accountNo="sbi1";
	
	public int deposite(int amount,String accountNO) throws AccountNoNotFount
	{
		System.out.println("---------Deposite methode--------");
		Log l=LogFactory.getLog(this.getClass());
		l.warn(amount+"\t"+accountNO);
			if(accountNO.equals(this.accountNo))
		 {
				
				
				this.amount=amount+this.amount;
				return this.amount;
			}
			else
			{
				throw new AccountNoNotFount();
			}
	}
	
	public int getAmount(int accountNO)
	{
		System.out.println("-------Get Ammount Method------");
		return 209000;
	}
}
