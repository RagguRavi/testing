package compititiveAlgo;

public class Prog1 {
	public static void main(String[] args) {
		int arr[] = {5,3,2,4,1};
		int k = 4,l=2,r=4;
		
		int arrSize = r-l;
		int temArr[] = new int[arrSize+1];
		
		int count = 0;
		for(int i = l;i <= r; i++) {
			temArr[count++] = arr[i];
		}
		
		for(int i:temArr) {
			System.out.println(i);
		}
		
		
	}
	
	int findLargestAtIndex(int arr[],int index) {
		int sortedArr[] = new int[arr.length];
		
		
		return 0;
	}
}
