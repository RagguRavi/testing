package core.java1;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Test6 {

	public static void main(String[] args) {
		/*int low = -100;
		int high = 100;
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		
		while(set.size() <= 100) {
			
			int result = r.nextInt(high-low) + low;
			set.add(result);
		}
		
		for(Integer i: set) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		for(Integer i: set) {
			
			for(Integer a: set) {
				if(i+a == 50) {
					System.out.println(i+" "+a);
				}
			}
			
		}*/
		
		System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
	}
	
	
	 public static int[] twoSum(int[] nums, int target) {
	        int length = nums.length;
	        int[] arr = new int[2];
	        
	        for(int i=0;i<length;i++) {
	            int a = nums[i];
	            
	            for(int j=i;j<length;j++) {
	            	
	            	if(i != j) {
		                if((a+nums[j]) == target){
		                    
		                    
		                    arr[0]=i;
		                    arr[1] = j;
		                    return arr;
		                }
	            	}
	                
	            }
	         
	            
	        }
	        return arr;
	    }

}
