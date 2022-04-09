package core.algo.simple;

public class Factorial {

	public static void main(String[] args) {
		int numbr = 9;
		System.out.println(getFactorial(numbr));
		System.out.println(getFactorialByForLoop(numbr));

	}
	
	public static int getFactorial(int number) {
		if(number <= 1 ) {
			return 1;
		}
		return number * (getFactorial(number-1));
	}
	
	public static int getFactorialByForLoop(int number) {
		
		int factorial = 1;
		
		for(int i = 1;i<=number;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
	

}
