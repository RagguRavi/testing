package spring.AOP.SpringAOP;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfterService implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object o, Method m, Object[] param, Object ret) throws Throwable {
		System.out.println("==========After Returning Advice-=========");
		Log l=LogFactory.getLog(this.getClass());
		l.info(ret);
		
	}

}
