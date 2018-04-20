package spring.AOP.SpringAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogAroundService implements MethodInterceptor{

	
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("-----LogAroundServcie------------");
		Log l=LogFactory.getLog(this.getClass());
		l.info("Before Calling Methode ");
		Object result =mi.proceed();
		l.info("After Calling Method  "+result);
		return result;
	}

}
