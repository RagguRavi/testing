package core.algo.searching;

public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = {-4,-1,3,7,10,11};
		System.out.println(binarySearch(arr, 0, arr.length-1, 2));
		System.out.println(binarySearchIterative(arr, 2));
	}
	
	public static int binarySearchIterative(int arr[],int element) {
		int l = 0;
		int r = arr.length-1;
		
		while(l<r) {
			int mid = (l+r)/2;
			
			if(arr[mid] == element)return mid;
			
			if(arr[mid] > element) {
				r = mid-1;
			} else {
				l = mid+1;
			}
		}
		
		return -1;
	}
	public static int binarySearch(int arr[],int r,int l,int element) {
		int midIdx = (r+l)/2;
		
		if(r > l) {
			return -1;
		}
		if(arr[midIdx] == element)return midIdx;
		
		if(arr[midIdx]>element) {
			return binarySearch(arr, r, midIdx-1, element);
		} else {
			return binarySearch(arr, midIdx+1, l, element);
		}
	}
}
