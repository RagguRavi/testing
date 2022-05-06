package core.algo.bitManupulation;

import java.util.Arrays;

public class ReverseBit {
	public static void main(String args[]) {
		long number = 8;
		int bits[] = new int[32];
		int idx = 0;
		while(number > 0) {
			if((number & 1) != 0) {
				bits[idx] = 1;
			}
			
			idx++;
			number = number >> 1;
		}
		
		
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i< 32;i++) {
			sb.append(bits[i]);
		}
		
		
		
		long reverse = Long.parseLong(sb.toString(), 2);
		
		System.out.println(reverse);
	}
	
	
	//Formula to get the set bit is = Log2(number)+1
	public static int getNoOfSetBit(long number) {
		Double logNo =  Math.log(number) / Math.log(2);
		int value = logNo.intValue();
		
		return value+1;
	}
}
