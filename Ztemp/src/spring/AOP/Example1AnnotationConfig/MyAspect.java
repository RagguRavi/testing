package spring.AOP.Example1AnnotationConfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(* spring.AOP.Example1.Bank.*(..))")
	public void myPointCut() {}
	
//	@Around("execution(* spring.AOP.Example1AnnotationConfig.Bank.*(..))")
	public Object doOperation(ProceedingJoinPoint proceedingJoinPoint) {
		/*Object[] objArray = new Object[2];
		objArray[0] = 100;
		objArray[1] = "Nitin";
		
		for(Object ob : proceedingJoinPoint.getArgs()) {
			System.out.println(ob);
		}*/
		System.out.println("=======@Around before method=======");
		Object obj=null;
		try {
			obj = proceedingJoinPoint.proceed();
			System.out.println("=======@Around after method=======");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	@Before("args(amount,..)")
	public void before(int amount) {
		System.out.println("######### this is befor advise ########"+amount);
		
	}
	/*
	@After("execution(* spring.AOP.Example1AnnotationConfig.Bank.*())")
	public void afterAdvice() {
		System.out.println("+++++ After Advice +++++");
	}
	
	@AfterReturning(pointcut = "execution(* spring.AOP.Example1AnnotationConfig.Bank.getAmount(..))",returning="retValue")
	public void afterReturning(Integer retValue) {
		System.out.println("~~~~~~~~~~ after Returning ~~~~~~~~~~");
		System.out.println(retValue);
	}
	
	@AfterThrowing(pointcut = "execution(* spring.AOP.Example1AnnotationConfig.Bank.deposite(..))",throwing="ex")
	public void afterThrowing(Exception ex) {
		System.out.println("@@@@@@@@@ after throwing @@@@@@@");
		System.out.println(ex);
	}*/
}
