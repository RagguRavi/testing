package spring.AOP.SpringAOP;

import org.springframework.aop.framework.ProxyFactoryBean;

import spring.AOP.aspectjAnnotation.Bank;

public class AOPMain {
public static void main(String[] args) {
	Bank bank=new Bank();
	
	LogBeforeService lb=new LogBeforeService();
	LogAfterService la=new LogAfterService();
	LogAroundService las=new LogAroundService();
	MethodThrowingService lts=new MethodThrowingService();
	ProxyFactoryBean proxyFactory=new ProxyFactoryBean();
	proxyFactory.setTarget(bank);
	proxyFactory.addAdvice(lb);
	proxyFactory.addAdvice(la);
	proxyFactory.addAdvice(las);
	proxyFactory.addAdvice(lts);
	
	Bank pb=(Bank)proxyFactory.getObject();
//	pb.deposite(2000, "sbi2");
	pb.getAmount(123);
}
}
