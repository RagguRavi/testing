package spring.AOP.IntroductionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		System.out.println("-----------------container intialized---------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springIntroductionsExample.xml");
		Bank bank = (Bank)applicationContext.getBean(Bank.class);
		bank.sayHello();
	}
}

