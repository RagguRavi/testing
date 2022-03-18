package core.algo.searching;

public class JumpSearch {
	public static void main(String args[]) {
		int[] arr = { 3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 47, 51, 55, 59, 63, 67, 71, 75, 79, 83, 87, 91, 95, 99};

		int x = 43;

		System.out.println(jumpSearch(arr, x));
	}
	
	
	public static int jumpSearch(int[] arr,int x) {
		int length = arr.length;
		int step = (int)Math.sqrt(length);
		int preIndex = step;
		
		while(arr[preIndex-1] <= x) {
			preIndex = preIndex+step;
		}
		
		System.out.println(preIndex);
		
		for(int i = preIndex;i>(preIndex-step)-1;i--) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
