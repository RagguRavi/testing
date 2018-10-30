package spring.core;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-core.xml");
//	AnotherBean ab=(AnotherBean)context.getBean("ab");
//	System.out.println(ab);

	RestTemplate restTemplate = (RestTemplate)context.getBean("restTemplate");
	System.out.println(restTemplate);
}
}
