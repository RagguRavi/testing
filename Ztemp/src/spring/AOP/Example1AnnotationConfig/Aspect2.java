package spring.AOP.Example1AnnotationConfig;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect2 {

	@Pointcut("execution(* *)")
	public void everyMethode() {}
	
}
