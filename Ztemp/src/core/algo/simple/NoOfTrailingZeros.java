package core.algo.simple;

public class NoOfTrailingZeros {
	public  static void main(String [] args) {
//		int no = 25;
		//System.out.println(noOfTralingZeroInFactorial(no));
		//System.out.println(noOfTralingZeroInFactorial2(no));
		
		System.out.println(1%3);
		
	}
	
	public static int noOfTralingZeroInFactorial(int number) {
		int _5count = 0;
		int dividedBy = 5;
		int tempNo = number;
		while(tempNo > 0) {
			int temp = number/dividedBy;
			_5count  = _5count + temp;
			
			dividedBy = dividedBy*5;
			tempNo = temp;
		}
		
		return _5count;
	}
	
	public static int noOfTralingZeroInFactorial2(int number) {
		int _5count = 0;
		for(int i=5;i<=number;i = i*5) {
			_5count =_5count+ number/i;
		}
	
		
		return _5count;
	}
}
