package spring.core.validation;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;

public class Main {
public static void main(String[] args) {
	System.out.println("---------Applicatoin is started----------");
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-validation.xml");
	
	Customer customer=applicationContext.getBean(Customer.class);
	
	CustomerValidator customerValidator = applicationContext.getBean(CustomerValidator.class);
	Map<Object, Object> map=new HashMap<>();
	Errors error=new MapBindingResult(map,"customer");
	customerValidator.validate(customer, error);
	
	System.out.println(error);
	System.out.println(map);
	
	BeanWrapper beanWrapper = new BeanWrapperImpl(new Address());
	beanWrapper.setPropertyValue("city", "Panchkula");
	
	PropertyValue propertyValue=new PropertyValue("state", "Haryana");
	
	beanWrapper.setPropertyValue(propertyValue);
	
	System.out.println(beanWrapper.getPropertyValue("abc"));
	
	}
}
