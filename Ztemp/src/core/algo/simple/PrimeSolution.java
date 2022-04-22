package core.algo.simple;

public class PrimeSolution {

	public static void main(String[] args) {
		System.out.println(isPrime(7));
		System.out.println(titleToNumber("BZ"));

	}
	
	public static int isPrime(int a) {
		int half = a/2;
		
		for(int i=2;i<=half;i++) {
			if(a%i == 0) {
				return 0;
			}
		}
		return 1;
    }

	public static  int titleToNumber(String a) {
		a = a.toUpperCase();
		
		int number = 0;
		char [] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch =arr[i];
			int aa = ch-64;
			number = aa;
		}
		
		return number;
    }
}
