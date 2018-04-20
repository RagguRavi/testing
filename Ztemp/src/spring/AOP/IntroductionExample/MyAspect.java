package spring.AOP.IntroductionExample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class MyAspect {

	@DeclareParents(value = "spring.AOP.IntroductionExample.Bank.*+", defaultImpl = NameImpl.class)
	Name nameVar;

	@Before("spring.AOP.IntroductionExample.Bank.sayHello() && this(name)")
	public void before(Name name) {
		System.out.println("######### this is befor advise ########"+name);
		
		
	}
}
