package core.algo.bitManupulation;

import java.util.*;

public class SingleNumberFromThriceRepeating {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,9,3,2,3,2);
		singleNumber(list);
	}
	
	
	 public static int singleNumber(final List<Integer> list) {
	        int arr[] = new int[32];
	        
	        for(int a: list) {
	        	int idx = 0;
	        	while(a > 0) {
	        		if((a&1) != 0) {
	        			arr[idx] = arr[idx]+1;
	        		}
	        		idx++;
	        		a = a>>1;
	        	}
	        }
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i] > 0) {
	        		arr[i] = arr[i]%3;
	        	}
	        	
	        }
	        
	        StringBuffer sb = new StringBuffer();
	        for(int i=31;i>=0;i--) {
	        	sb.append(arr[i]);
	        	
	        }
	        
	        int result = Integer.parseInt(sb.toString(), 2);
	        return result;
	    }
}
