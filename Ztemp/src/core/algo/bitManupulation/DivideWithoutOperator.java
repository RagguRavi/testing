package core.algo.bitManupulation;

public class DivideWithoutOperator {

	public static void main(String[] args) {
		System.out.println(0l | (1<< 31));
		
//		int a =  -5;
//		System.out.println(Integer.MAX_VALUE);

	}
	
	public static int divide(int a, int b) {
		int result = 0;
		int sign=((a<0) ^ (b<0))?-1:1;
		
//		if(a == Integer.MIN_VALUE) {
//			a = Integer.MAX_VALUE;
//		}
		if(a<0) {
			a = -(a);
		}
		
		if(b<0) {
			b = -(b);
		}
		
		while(a >= b) {
			result++;
			a = a-b;
		}
		
		if(sign == -1) {
			result = -result;
		}
		
		return result;
	}

}
