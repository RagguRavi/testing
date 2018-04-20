package spring.core.PropertyEditorExample;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	System.out.println("---------Applicatoin is started----------");
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-propertyEditor.xml");
	
	Customer customer=applicationContext.getBean(Customer.class);
	
	CustomEditorConfigurer configurer = applicationContext.getBean(CustomEditorConfigurer.class);
	
	}
}
