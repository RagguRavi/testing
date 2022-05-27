package core.algo.ArrayProblem;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = {10,15,-5,15,-10,5};
		int target = 20;
		
		subArrayGivenSum(arr, target);

	}
	
	static void subArrayGivenSum(int[] arr, int sum) {
		Map<Integer,Integer> map = new HashMap<>();
		int currentSum =0;
		int start = 0;
		int end= -1;
		
		for(int i=0;i<arr.length;i++) {
			int ele = arr[i];
			currentSum+= ele;
			
			/*
			 * if(currentSum == sum) { start = 0; end=i; break; }
			 */
			
			int compliment = sum - currentSum;
			if(map.containsKey(compliment)) {
				start = map.get(compliment);
				end = i;
				break;
			}
			map.put(currentSum, i);
		}
		
		System.out.println(map);
		System.out.println(start+"\t"+end);
	}

}
