package core.algo.bitManupulation;

public class FindSetBitInNumber {
	public static void main(String [] args) {
		int number = 0; //1101
				
		System.out.println(getSetBit(number));
		System.out.println(getSetBit2(number));
		
	}
	
	public static int getSetBit(int number) {
		int setBitCount = 0;
		while(number > 0) {
			
			if(number % 2 != 0) {
				setBitCount++;
			}
			
			number = number >> 1;
		}

		return setBitCount;
	}
	
	public static int getSetBit2(int number) {
		int setBitCount = 0;
		while(number > 0) {
			setBitCount++;
			number = number & number-1;
		}

		return setBitCount;
	}
}
