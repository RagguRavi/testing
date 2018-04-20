package spring.AOP.SpringAOP;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class AmountPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method methode, Class<?> clas) {
		String methodName=methode.getName();
		if(methodName.equals("getAmount"))
		return false;
		else
			return true;
	}

}
