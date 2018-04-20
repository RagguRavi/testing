package spring.AOP.IntroductionExample;

public class AccountNoNotFount extends RuntimeException {
 static final long serialVersionUID = 1L;

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Account No is not valid";
}
}
