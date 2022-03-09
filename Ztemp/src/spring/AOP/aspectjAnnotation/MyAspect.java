package spring.AOP.aspectjAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Pointcut("execution(* spring.AOP.aspectjAnnotation.Bank.*(int,..))")
	public void anyPublicOperation() {}
	
	@Pointcut("execution(* spring.AOP.aspectjAnnotation.Bank.*(..)) && args(customer,..)")
	public void specificObject(Customer customer) {}
	
	@Pointcut("execution(* spring.AOP.aspectjAnnotation.Bank.*(..)) && args(..,customer)")
	public void specificObject2(Customer customer) {}
	
	@Pointcut("execution(* spring.AOP.aspectjAnnotation.Bank.*(..)) && args(customer)")
	public void specificObject3(Customer customer) {}
	
	@Before("specificObject(customer) || specificObject2(customer) || specificObject3(customer)")
	public void beforeAdvice(Customer customer) {
		System.out.println("------LOG BEFORE-----"+customer);
	}
	
	/*@Before("spring.AOP.aspectjAnnotation.Bank.*(..) && args(customer,..)")
	public void beforeAdvice(Customer customer) {
		System.out.println("------LOG BEFORE-----"+customer);
	}*/
	/*@After("anyPublicOperation()")
	public void afterAdvice()
	{
		System.out.println("----LOG AFTER--------");
	}
	@AfterReturning("anyPublicOperation()")
	public void afterReturning()
	{
		System.out.println("--------LOG AFTER RETURNING-------");
	}
	@AfterThrowing("anyPublicOperation()")
	public void afterThrowing()
	{
		System.out.println("--------LOG AFTER Throwing-------");
	}*/
}
