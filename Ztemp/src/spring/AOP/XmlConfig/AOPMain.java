package spring.AOP.XmlConfig;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class AOPMain {
public static void main(String[] args) {
	System.out.println("-----------------container intialized---------");
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springAopExample.xml");
	Bank bank = applicationContext.getBean(Bank.class);
	bank.deposite(10, "sbi1");
	bank.sayHello();
}
}
