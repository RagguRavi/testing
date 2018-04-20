package spring.core.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCMain {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-ioc.xml");
	
	
}
}
