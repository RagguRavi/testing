package core.algo.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
		int ar[] = {8,4,1,5,9,2};
		mergeSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void mergeSort(int arr[],int l, int r) {
		
		if(r>l) {
			int middle = (l+r)/2;
			mergeSort(arr, l, middle);
			mergeSort(arr, middle+1, r);
			merge(arr, l, middle, r);
		}
	}
	
	public static void merge(int[] arr,int l, int mid, int r) {
		int b[] = new int[arr.length];
		int i = l;
		int j = mid+1;
		int k = l;
		
		while(i<=mid && j<=r) {
			
			//Case when left side array element is greater than Right side array element
			if(arr[i] > arr[j]) {
				b[k] = arr[j];
				j++;
			} else {
				b[k] = arr[i];
				i++;
			}
			k++;
		}		
		//Case when one side array is completely traversed but other side array is remaining
		
		//When left side array is completely traversed but right side array is pending
		if(i>mid) {
			while(j<=r) {
				b[k]=arr[j];
				j++;
				k++;
			}
		} else {
			while(i<=mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		
		//Merging arr B into arr
		for(int x=l;x<=r;x++) {
			arr[x] = b[x];
		}
		
		
	}
}
