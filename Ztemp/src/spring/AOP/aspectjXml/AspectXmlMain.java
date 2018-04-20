package spring.AOP.aspectjXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectXmlMain {

	public static void main(String[] args) {
		System.out.println("------AOP with Aspect Xml Style----------");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-AOPaspectXml.xml");
		
		Bank bank=(Bank)ctx.getBean("bank");
		
//		bank.getAmount(100);
		bank.deposite(2, "sbi01");
	}

}
