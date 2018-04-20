package spring.AOP.SpringAOP;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice{

	
	public void before(Method meth, Object[] arg1, Object obj) throws Throwable {
		System.out.println("------Methode before Log service-----");
		Log l=LogFactory.getLog(this.getClass());
		l.info(meth);
		
	}

}
