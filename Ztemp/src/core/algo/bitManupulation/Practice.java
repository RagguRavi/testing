package core.algo.bitManupulation;

import java.util.Arrays;

public class Practice {
	public static void main(String []args) {
//		System.out.println(setBits(3));
		 int[] arr = new int[] {2,3,4,5,4,5,3,7};
		 
		singleNumber(arr);
	}

	public static int[] singleNumber(int[] nums) {
        int [] result = new int[2];
        
        int sum =0;
        for(int num:nums) {
        	sum = sum ^ num;
        }
        //Get RightMOST set bit
        sum = sum & ~(sum-1);
        
        int x=0,y=0;
        for(int num: nums) {
        	if((num & sum) > 0) {
        		x = x ^ num;
        	} else {
        		y = y ^ num;
        	}
        }
       
        result[0]=x;
        result[1]=y;
        
        Arrays.sort(result);
		return result;
    }
	
	static int setBits(int n) {
	       int result = 0;
	       
	       while(n>0){
	           n = n & (n-1);
	           result++;
	       }
	       
	       return result;
	    }
	
	 public static int countSetBits(int n){
		   int result = 0;
		   for(int i=1;i<=n;i++) {
			   int no = i;
			   while(no > 0) {
				   no = no & no-1;
				   result++;
			   }
		   }
	       
	       return result; 
	    }
	public static int swapBits(int n) {
		int result = 0;
		
		int oddBits = n & 0x55555555;
		int evenBits = n & 0xAAAAAAAA;
		
		evenBits = evenBits >>1;
		oddBits = oddBits <<1;
		
		result = evenBits | oddBits;
		return result;
	}
	 
	/*  Function to calculate the longest consecutive ones
	    *   N: given input to calculate the longest consecutive ones
	    */
	    public static int maxConsecutiveOnes(int n) {
	        
	    	int max =0;
	    	int current = 0;
	    	while(n > 0) {
	    		
	    		if((n&1) != 0) {
	    			current++;
	    		} else {
	    			if(current > max) {
	    				max = current;
	    			}
	    			current = 0;
	    		}
	    		
	    		if(current > max) {
    				max = current;
    			}
	    		n = n >> 1;
	    	}
	    	
	    	
	        
	    	return max;
	    }
	    
	//Function to find the first position with different bits.
	public static int posOfRightMostDiffBit(int m, int n)
	{

		int no = m ^ n;
		int result = 0;
		while(no > 0) {
			result++;

			if((no & 1) != 0){
				break;
			}

			no = no >> 1;
		}

		return result; 
	}
}
