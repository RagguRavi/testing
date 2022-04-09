package core.algo.simple;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(reverse(123999));
	}
	
	static int  reverse(int i) {
		
		int reverse = 0;
		
		while(i>0) {
			int modlus = i%10;
			reverse = reverse*10+modlus;
			i = i/10;
		}
		
		return reverse;
	}

}
