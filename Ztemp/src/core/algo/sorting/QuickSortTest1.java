package core.algo.sorting;

import java.util.Arrays;

public class QuickSortTest1 {
		public static void main(String args[]) {
			int arr[] = {4,6,2,5,7,9,1,3};
			
			int pivot = arr[0];
			int i =1 ;
			int j = arr.length-1;
			
			while(i < j) {
				
				if(arr[i] > pivot && arr[j] < pivot) {
						swap(i, j, arr);
				} else if(arr[i] < pivot) {
					i++;
				} else {
					j--;
				}
				
				
			}
			
		System.out.println(Arrays.toString(arr));
			
		}
		
		private static void swap(int i, int j , int arr[]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
}
