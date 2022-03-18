package core.algo.searching;

public class SearchAlgo {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 43, 47, 51, 55, 59, 63, 67, 71, 75, 79, 83, 87, 91, 95, 99};

		int x = 19;

		System.out.println(linearSearch(arr, x));
		//binarySearch
		System.out.println(jumpSearch(arr,x));
	}

	
	
	
	
	public static int jumpSearch(int[] arr, int x) {
		int length = arr.length;
		int jump = (int) Math.sqrt(length);
		
		int step = jump;
		
		while(arr[step-1] < x) {
			if(arr[step] < x) {
				step = step+jump;
			} else {
				break;
			}
		}
		
		
		System.out.println(step+"  "+arr[step-1]);
		for(int a = step-1;a > step-jump;a--) {
			if(arr[a] == x) {
				return a;
			}
		}
		
		return -1;
	}
	
	
	public static int linearSearch(int[] arr, int x) {
		int position = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			} else if (arr[i] > x) {
				return -1;
			}
		}

		return position;
	}
	
	
	public static int binarySearch(int[] arr,int x) {
		int position = -1;
		int left = 0;
		int length = arr.length;

		int right = length - 1;


		while(left <= right) { 
			int m = (left + right) / 2; 
			System.out.println("From "+left+" to: "+right);

			if(arr[m] == x) {
				return m;
			}

			if(x > arr[m]) {
				left = m+1;
			} else {
				right = m-1;
			}
		}
		return position;
	}
	
	
}
