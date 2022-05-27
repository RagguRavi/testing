package core.algo.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
//		sort1(arr);
		System.out.println("------------------------------------------");
//		int result[] = sort(arr);
//		
//		System.out.println(Arrays.toString(result));
		
//		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int[] sort(int[] arr) {
		
		int length = arr.length;
		
		for(int i = 0;i<length-1;i++) {
			int minIndex = i;
			for(int j = i+1;j<length;j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex=j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		
		return arr;
	}
	
	
	static void  sort1(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
            	if (arr[j] < arr[min_idx]) {
            		min_idx = j;
            	}
            }
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            System.out.println(Arrays.toString(arr));
        }
    }

}
