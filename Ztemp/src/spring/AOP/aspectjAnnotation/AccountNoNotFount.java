package spring.AOP.aspectjAnnotation;

public class AccountNoNotFount extends RuntimeException {
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Account No is not valid";
}
}
