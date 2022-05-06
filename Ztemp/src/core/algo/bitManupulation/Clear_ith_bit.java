package core.algo.bitManupulation;

public class Clear_ith_bit {

	public static void main(String[] args) {
		int a = 309; //0b_1_0_0_1_1_0_1_0_1 -> Getting 5th bit of this number is 1
		int bitNumber = 5;
		
		int mask = 1 << bitNumber-1;
		mask = ~mask;
		int number = a & mask;
		
		System.out.println(Integer.toBinaryString(number));
	}

}
