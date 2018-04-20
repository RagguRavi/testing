package spring.AOP.IntroductionExample;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		System.out.println("-----------------container intialized---------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springIntroductionsExample.xml");
		Bank bank = (Bank)applicationContext.getBean(Bank.class);
		bank.sayHello();
	}
}

