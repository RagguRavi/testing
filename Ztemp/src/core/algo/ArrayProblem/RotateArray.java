package core.algo.ArrayProblem;

import java.util.Arrays;

public class RotateArray {
	public static void main(String args[]) {
		int [] arr = {8,2,1,5};
		
		System.out.println(Arrays.toString(rotatedArray(arr, 1)));
	}
	
	public static int[] rotatedArray(int [] arr,int times) {
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<n;j++) {
				int index = (i+j)%n;
				System.out.print(index+" ");
			}
			
			System.out.println();
		}
		return null;
	}
}
