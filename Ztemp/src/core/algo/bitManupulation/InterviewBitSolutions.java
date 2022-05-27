package core.algo.bitManupulation;

import java.awt.BufferCapabilities.FlipContents;
import java.util.ArrayList;
import java.util.Collections;

public class InterviewBitSolutions {
	public static void main(String args[]) {
//		System.out.println(countTotalSetBit(1000000000));
//		System.out.println(countTotalSetBit2(1000000000));
		System.out.println(swapBits(9,1,3));
	}
	
	 public static int swapBits(int A, int B, int C) {
		 
		 System.out.println(Integer.toBinaryString(A));
		 int firstBit = (A >> B-1)&1; 
		 int secondBit= (A >> C-1)&1;
		 
		 
		 
		 System.out.println(firstBit+"\t"+secondBit);
		 
		 if(firstBit == secondBit) {
			 return A;
		 } else {
			 int setBit = firstBit == 1 ? B : C;
			 int removeBit = firstBit == 0?B:C;
			 int mask = 1 << setBit-1;
			 mask = ~mask;
			int temp = A & mask;
			 System.out.println(Integer.toBinaryString(temp));
		 }
		 return 0;
	 }
	 
	public static int filipBit(int no) {
		
		StringBuffer sb = new StringBuffer();
		while(no > 0) {
			int temp = no & 1;
			if(temp != 0) {
				sb.append("0");
			} else {
				sb.append("1");
			}
			
			no = no >> 1;
		}
		
		sb.reverse();
		return Integer.parseInt(sb.toString(), 2);
	}
	
	public static  int countTotalSetBit(int n) {
        int count = 0;
        for(int i = 1;i<=n;i++) {
            int temp = i;
            while(temp>0) {
                count++;
                temp = temp & (temp-1);
            }
        }
        return count;
    }
	
	public static int no =  (Double.valueOf(Math.pow(10,9)).intValue()+7);
	public static  int countTotalSetBit2(int n) {
        int x = getMaxPowerOf2(n);
        if(n == 0) {
        	return 0;
        }
        int bitsTill2x = ((1 << x-1)*x)%no;
        int fromXtoN = (n-(1 << x)+1)%no;
        
        int reminder = n - (1<<x);
        
        int totalBits = ((bitsTill2x+fromXtoN) % no + (countTotalSetBit2(reminder)) % no ) %  no;
      
        return totalBits;
    }
	
	public static int getMaxPowerOf2(int number) {
		int x = 0;
		while((1 << x) <= number) {
			x++;
		}
		x = x-1;
		return x;
	}
	public static int minXorValue(ArrayList<Integer> list) {
		  Collections.sort(list);
		    
		    
		    int result = Integer.MAX_VALUE;
		    for(int i=0;i<list.size()-1;i++) {
		    	int temp = list.get(i) ^ list.get(i+1);
		    	if(temp<result) {
		    		result=temp;
		    	}
		    
		    }
		    
		    return result;
	}

}
