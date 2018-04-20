package spring.AOP.Example1AnnotationConfig;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class AOPMain {
public static void main(String[] args) {
	System.out.println("-----------------container intialized---------");
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springAopExample.xml");
	Bank bank = applicationContext.getBean(Bank.class);
//	bank.deposite(10, "sbi1");
//	bank.sayHello();
	bank.getAmount(1);
	bank.getAccount(3);
	/*BankAccount bankAccount = new BankAccount("Nitin", "123char");
	bank.displayAccountInfo(bankAccount);
	StudentService studentService = applicationContext.getBean(StudentService.class);
	studentService.helloStudent("Ravi kumar Raggu");
	
	bank.deposite(111, "11212");*/
}
}

