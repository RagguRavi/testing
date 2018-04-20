package spring.AOP.aspectjAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Pointcut("execution(public * *(..))")
	public void anyPublicOperation() {}
	
	@Before("anyPublicOperation()")
	public void beforeAdvice()
	{
		System.out.println("------LOG BEFORE-----");
	}
	
	
	@After("anyPublicOperation()")
	public void afterAdvice()
	{
		System.out.println("----LOG AFTER--------");
	}
	@AfterReturning("anyPublicOperation()")
	public void afterReturning()
	{
		System.out.println("--------LOG AFTER RETURNING-------");
	}
	@AfterThrowing("execution(public * *(..))")
	public void afterThrowing()
	{
		System.out.println("--------LOG AFTER Throwing-------");
	}
}
