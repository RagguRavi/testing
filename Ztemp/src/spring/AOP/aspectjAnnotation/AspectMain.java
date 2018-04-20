package spring.AOP.aspectjAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-AOPaspect.xml");
	Bank bank=(Bank)ctx.getBean("bank");
//	bank.getAmount(123);
	bank.deposite(123, "asdf");
}
}
