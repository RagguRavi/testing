package core.algo.bitManupulation;

/*
 * This is the solution of problem:
 * 
 * Find the only non-repeating element in an array where every element repeat twice exactly.
 * 
 * 
 */
public class UniqueElementFromTwice {
	public static void main(String args[]) {
		int arr[] = {5,4,1,4,3,5,1};
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			res = res ^ arr[i];
		}
			
//		System.out.println(11&(-11));
		
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(17));
		System.out.println(Integer.toBinaryString(24));
		System.out.println(Integer.toBinaryString(19));
		
		
		int a = 13;
//		System.out.println(Integer.toBinaryString(a)+"\t\n"+Integer.toBinaryString(-a)+"\n\t"+Integer.toBinaryString(a & -a));
		
	}
}
