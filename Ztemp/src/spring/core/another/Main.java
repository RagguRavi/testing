package spring.core.another;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	System.out.println("---------Applicatoin is started----------");
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-another.xml");
	EventPublisher ep=context.getBean(EventPublisher.class);
	ep.publish();
	
	ResourceLoaderExample rle=context.getBean(ResourceLoaderExample.class);
	while(true) {
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		if(path.equalsIgnoreCase("n")) {
			break;
		}
		else {
			rle.loadFile(path);
		}
	}
	}
}
