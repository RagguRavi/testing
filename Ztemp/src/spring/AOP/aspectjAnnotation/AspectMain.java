package spring.AOP.aspectjAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-AOPaspect.xml");
	Bank bank=(Bank)ctx.getBean("bank");
//	bank.getAmount(123);
	bank.deposite(123, "sbi1");
	
	bank.getAmount(111);
	
	Customer customer = new Customer("Nitin", "nitin@123", "12334235");
	bank.checkIt(1,customer,1);
	bank.checkIt1(1, customer);
	bank.checkIt2(customer, 1);
	bank.checkIt3(customer);
	
}
}
