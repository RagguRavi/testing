package core.algo.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.LongStream;

import io.jsonwebtoken.lang.Collections;

public class GFGSol1 {

	public static void main(String[] args) {
		int [] arr = {2,3,1,1,2,4,2,0,1,1} ;
		System.out.println(minJumps(arr));
		
//		System.out.format();
	}
	
	
	
	public static void main1() {
		int a1[] = {86,32,31,98,37,65,98,71,99,58,59,32,52,69,15,75,4,86,57,36,83,18,58,50,43,29,98,53,80,5,89,73,8,97,17,100,9,21,55,55,32,74,60,32,87,72,54};
		int a2[] = {126,112,134,138,89,118,107,124,126,83,133,64,124,109,108,132,111,95,82,106,86,118,82,78,92,55,128,121,118,95,94,110,111,146,124,148,95,146,109,61,93,126,74,76,110,78,91};

		maxMeetings(a1, a2, a1.length);
	}
	
	static int minJumps(int[] arr){
		if(arr.length <= 1) {
			return 1;
		}
		
		int steps = 1;
		int jump=arr[0];
		while(jump<(arr.length-1)) {
			System.out.print(arr[jump]+" ");
			if(arr[jump] == 0) {
				return -1;
			}
			jump += arr[jump];
			steps++;
		}
		
		return steps;
    }
	public long minValue(long a[], long b[], long n) {
       Arrays.sort(a);
     
      long minProd = 1;
      
      for(int i=0;i<n;i++) {
    	  int temp = (int)(n-1)-i;
    	  minProd = (a[i] * b[temp]);
      }
      
      
      return minProd;
    }
	  public static int maxMeetings(int start[], int end[], int n) {
		List<MyClass> list = new LinkedList<>();
        for(int i=0;i<n;i++) {
        	MyClass temp = new MyClass(start[i], end[i], (end[i]-start[i]));
        	list.add(temp);
        }
        
        list.sort(new Comparator<MyClass>() {
			public int compare(MyClass o1, MyClass o2) {
				return o1.end - o2.end;
			}
		});
        
      
        int result = 1;
        int pre = 0;
        
        List<MyClass> meetingList = new LinkedList<>();
        meetingList.add(list.get(0));
        for(int i=1;i<n;i++) {
        	MyClass cur = list.get(i);
        	if(cur.start >= list.get(pre).end) {
        		result++;
        		pre = i;
        		meetingList.add(cur);
        	}
        }
        list.forEach(System.out::println);
        System.out.println("=============================================================");
        meetingList.forEach(System.out::println);
        System.out.println(result);
	     return result;
	   }
	    
	    
	    static class MyClass {
	        int start;
	        int end;
	        int diff;
	        
	        public MyClass(int start,int end,int diff) {
				this.start = start;
				this.end = end;
				this.diff = diff;
			}
	        
	        @Override
	        public String toString() {
	        	return String.format("start: %s end: %s diff: %s", start,end,diff);
	        }
	        
	    }

}
