package core.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,4,7,8,9,3,2,44,33,22,11,66,77,88,77};
		
		int result[] = sort(arr);
		
		for(int i: result) {
			System.out.println(i);
		}
		
	}
	
	public static int[] sort(int[] arr) {
		
		int length = arr.length;
		
		for(int i = 0;i<length;i++) {
			int min = arr[i];
			for(int j = i;j<length;j++) {
				if(min > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		return arr;
	}

}
