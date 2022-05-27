package core.algo.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int arr[],int l,int r) {
		if(l<r) {
			int pivoteIdx = partition(arr,l,r);
			System.out.println(pivoteIdx);
			quickSort(arr, l, pivoteIdx-1);
			quickSort(arr, pivoteIdx+1, r);
		}
		
	}
	
	
	public static int  partition(int arr[],int l,int h) {
		int pivot = l;
		
		while(l<h) {
			while(arr[l]<=arr[pivot])l++;
			while(arr[h]>arr[pivot])h--;
			
			if(l<h)
			SelectionSort.swap(arr, l, h);
		}
		
		
		SelectionSort.swap(arr, h, pivot);
		return h;
	}
	
}
