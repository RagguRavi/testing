package core.algo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		sort(new int[]{3,4,5,2,1,9});
	}

	
	public static void sort(int[] arr) {
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			
			boolean isSwapped = true;
			for(int j=0;j<length-i-1;j++) {
				
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					isSwapped = false;
				}
			}
			
			if(isSwapped) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
