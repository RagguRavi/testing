package core.algo.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int ar[] = {8,4,1,5,9,2};
		int n = ar.length;
		for(int i=1;i<n;i++) {
			
			int temp = ar[i];
			
			for(int j=i-1;j>=0;j--) {
				if(temp < ar[j]) { 
					ar[j+1] = ar[j];
					ar[j] = temp;
					
				} else {
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(ar));
	}

	
}
