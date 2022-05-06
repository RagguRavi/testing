package core.algo.bitManupulation;

public class Find_ith_Bit {

	public static void main(String[] args) {
		int a = 309; //0b_1_0_0_1_1_0_1_0_1 -> Getting 5th bit of this number is 1
		int i = 5;
		oneWay(a, i);
		secondWay(a,i);
		
		
	}

	/*
	 * In this way we will right shift the bit to that ith times for which location we want to get bit.
	 * After shifting postion for that perticular bit will be on first place
	 * After that and(&) that bit with 1 if we get 0 then first bit would be 0 otherwise 1, As we right shift the bit to ith time so that bit
	 * will be on first 
	 */
	public static void oneWay(int no,int bitNumber) {
		int b = no >> bitNumber-1;
		
		int temp = b & 1;
		if(temp == 0) {
			System.out.println(bitNumber +"th Bit is 0");
		} else {
			System.out.println(bitNumber +"th Bit is 1");
		}

	}
	
	/**
	 * In this way instead of changing original no. bits we will left shift 1's bit to ith time to and then mask it with orignal no.
	 * 
	 * @param no
	 * @param bitNumber
	 */
	public static void secondWay(int no,int bitNumber) {
		int mask = 1 << bitNumber;
		System.out.println(mask);
		int temp = no & mask;
		
		if(temp == 0) {
			System.out.println(bitNumber +"th Bit is 0");
		} else {
			System.out.println(bitNumber +"th Bit is 1");
		}

	}
}
