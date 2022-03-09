package spring.AOP.Example1AnnotationConfig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Bank implements TargetInterface{
	int amount=5000;
	String accountNo="sbi1";
	
	public int deposite(int amount,String accountNO) throws AccountNoNotFount
	{
		System.out.println("---------Deposite methode--------" );
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
	
	public int getAmount(@MyAnnotation int accountNo)
	{
		System.out.println("-------Get Ammount Method(accountNo)------");
		return 209000;
	}
	
	public void sayHello() {
		System.out.println("hello everyone ! how are you..");
	}
	
	public void displayAccountInfo(BankAccount bankAccount) {
		System.out.println("-------------display Account Info ---------------");
		System.out.println(bankAccount.name +"\t"+bankAccount.number);
	}
	
	public int getAccount(int ammount) {
		System.out.println("=============getAccount(amount) ");
		return 19900;
	}
}
