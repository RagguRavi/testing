package spring.AOP.XmlConfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(* spring.AOP.Example1.Bank.*(..))")
	public void myPointCut() {}
	
	@Around("execution(* spring.AOP.Example1.Bank.*())")
	public Object doOperation(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("this is doOperation method before proceed ");
		Object obj=null;
		try {
			obj = proceedingJoinPoint.proceed();
			System.out.println("this is doOperation method after proceed");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	@Before("myPointCut()")
	public void before() {
		System.out.println("this is befor advise ");
	}
}
