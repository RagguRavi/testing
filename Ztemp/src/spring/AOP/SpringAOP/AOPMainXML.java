package spring.AOP.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.AOP.aspectjAnnotation.Bank;

public class AOPMainXML {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-AOP.xml");
	
	Bank bank=(Bank)context.getBean("proxy");
	bank.deposite(2000, "sbi1");
	bank.getAmount(2);
}
}
