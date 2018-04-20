package spring.AOP.aspectjXml;

public class BankAdvices {

	
	public void beforeAdvice()
	{
		System.out.println("------LOG BEFORE-----");
	}
	
	
	
	public void afterAdvice()
	{
		System.out.println("----LOG AFTER--------");
	}
	
	public void afterReturning()
	{
		System.out.println("--------LOG AFTER RETURNING-------");
	}
	
	public void afterThrowing()
	{
		System.out.println("--------LOG AFTER Throwing-------");
	}

}
