package spring.AOP.SpringAOP;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class MethodThrowingService implements ThrowsAdvice{

	public void afterThrowing(Method m,Object[] args,Object target,Exception e)
	{
		System.out.println("------Methode Thorwing Advice-----");
		Log l=LogFactory.getLog(this.getClass());
		l.info(target+"\t"+m+"\t"+e+"\t"+args[0]+"\t"+args[1]);
				
	}
}
