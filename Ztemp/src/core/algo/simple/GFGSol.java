package core.algo.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GFGSol {

	public static void main(String[] args) {
		
		/*
		 * int n = 3; int arr[][] = { {25,79,59}, {63,65,6}, {46,82,28} };
		 * 
		 * System.out.println(Arrays.toString(arr));
		 * System.out.println(downwardDigonal(n, arr));
		 */
	
	int ar[] = {5,3,1,9,8,2,4,7};
	bubbleSort(ar,ar.length);
	
	System.out.println(Arrays.toString(ar));
		
	}
	
	public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            for(int j = 1;j<n-i;j++){
                int a = arr[j-1];
                int b = arr[j];
                
                if(a > b) {
                	arr[j-1] = arr[j];
                	arr[j] = a;
                }
            }
        }
    }
	
	 static ArrayList<Integer> downwardDigonal(int n, int A[][])
	    {
	        ArrayList<Integer> list = new ArrayList<>();
	        
	      for(int i=0;i<n;i++) {
	          for(int j=0;j<n;j++){
	              list.add(A[i][j]);
	          }
	      }
	        return list;
	    }
	static int minJumps(int[] arr){
		return minJumsUtil(arr, arr.length, 0, arr[0]);
		
	}
	
	static int minJumsUtil(int[] arr,int n,int count,int steps) {
		if(n<=1) {
			return 0;
		}
		
		if(steps == 0) {
			return -1;
		}
		
		return 0;
	}
	 static public int minSteps(String s, String t) {
	        Map<Character,Integer> map = new HashMap<>();
	        char[] arr = s.toCharArray();
	        for(char ch: arr) {
	            
	            if(map.get(ch) != null) {
	                map.put(ch,map.get(ch)+1);
	            } else {
	                map.put(ch,1);
	            }
	        }
	        
	        int steps = 0;
	        
	        char[] toArr = t.toCharArray();
	        
	        for(char ch: toArr) {
	            Integer tempCount = map.get(ch);
	            if(tempCount == null || tempCount == 0) {
	                steps++;
	            } else {
	            	int count = tempCount-1;
	                map.put(ch,count);
	            }
	        }
	        
	        return steps;
	    }
	 
	 //Function to find the days of buying and selling stock for max profit.
    static ArrayList<ArrayList<Integer> > stockBuySell(int a[], int n) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        int profit = 0;
        
        for(int i=1;i<n;i++) {
             
            if(a[i] > a[i-1]) {
                ArrayList<Integer> tempL = new ArrayList<>();
                profit += a[i]-a[i-1];
                
                tempL.add(i-1);
                tempL.add(i);
                
                list.add(tempL);
            }
        }
        
        return list;
    }
    
	 static long maxSubarraySum(int arr[], int n){
        
	       int max = Integer.MIN_VALUE;
	       int maxTemp = 0;
	       
	       for(int i=0;i<n;i++) {
	           maxTemp = maxTemp + arr[i];
	           if(maxTemp > max) {
	               max = maxTemp;
	           }
	           
	           if(maxTemp < 0) {
	        	   maxTemp = 0;
	           }
	       }
	       
	 
	        
	        return max;
	    }
	
	static boolean valid(String s) 
    { 
        char ar[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch: ar) {
        	if(ch == ']' || ch == ')' || ch == '}') {
        		if(stack.size() == 0) {
        			return false;
        		}
        		char temp = stack.pop();
        		if(ch == ']' && temp != '[') {
        			return false;
        		} else if(ch == '}' && temp != '{') {
        			return false;
        		
        		} else if(ch == ')' && temp != '(') {
        			return false;
        		}
        	} else {
        		stack.push(ch);
        	}
        	
        }
        if(stack.size() == 0) {
        	return true;
        }
        
        return false;
    }
	
	 static void rotateby90(int matrix[][], int n)  { 
	        for(int i=(n-1);i>=0;i--) {
	        	
	        	for(int j=0;j<n;j++) {
	        		
	        	}
	        }
	    };

	static int columnWithMaxZeros(int arr[][], int N) {
		int maxCount = -1;
		int maxCountIdx = -1;
		for(int i=0;i<N;i++) {
			int count = 0;
			
			for(int j=0;j<N;j++) {
				if(arr[j][i] == 0) {
					count++;
				}
			}
			
			if(count > maxCount) {
				maxCount = count;
				maxCountIdx = i;
			}
			
			if(count == N) {
				return i;
			}
		}
		return maxCountIdx;
	}
	
	static ArrayList<String> permutation(String S){

		return null;
    }
	
	 static List<Integer> subsetSums(List<Integer> arr, int N){
		 if(N > arr.size()) {
			 return new ArrayList<>();
		 }
		 
		 
		 return null;
	 }
	 
	public static int josephus(int n, int k) {

		System.out.println(n+"\t"+k);
		if(n==1) {
			return 1;
		}

		int x = josephus(n-1,k);
		
		System.out.println(x);
		int y = (x+k )%n;

		if(y==0) {
			return 1;
		}
		return y;
	}
	
	public static Stack<Integer> sort(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int element = s.pop();
			sort(s);
			sortHelper(s,element);
		}
		
		return s;
	}
	
	public static void sortHelper(Stack<Integer> s,int ele) {
		int top = -1;
		if(!s.isEmpty()) {
			top = s.peek();
		}
		if(s.isEmpty() || ele > top) {
			s.push(ele);
		} else {
			int temp = s.pop();
			sortHelper(s, ele);
			
			s.push(temp);
		}
	}
	
	
	 public static boolean isLucky(int n) {
	        return luckyHelper(n, 2);
	    }
	    
	    
	    public static boolean luckyHelper(int n,int position) {
	    	
	    	if(n<position) {
	    		return true;
	    	} else {
	    		int temp = n/position;
	    		int isDivisble = n%position;
	    		if(isDivisble != 0) {
	    			return luckyHelper((n-temp), position+1);
	    		} else {
	    			return false;
	    		}
	    	}
	    }
	
	
	
	static int no = 1000000007;
	static long  power(int n,int r) {
		return powerHelper(n, r);
    }
	
	
	static long powerHelper(long n, long r) {
		if(r==0) {
			return 1;
		}
       if((r&1) != 0) { //odd Number
    	   
    	   return (powerHelper(n%no,r-1)%no * n%no)%no;
       } else {
    	   return (powerHelper(((n%no*n%no)%no),(r/2))%no);
       }
	}
	
	
	
	 static long steps = 0;
	public static long toh(int N, int from, int to, int aux) {
       
		if(N>0) {
			toh(N-1,from,aux,to);
			System.out.println(String.format("move disk %s from rod %s to rod %s", N,from,to));
			toh(N-1,aux,to,from);
			steps++;
			
		}
        
        return steps;
    }
	
	//Function to reverse every sub-array group of size k.
    static void reverseInGroups(List<Integer> arr, int n, int k) {
        int l=0;
        int r = k-1;
        
        while(l<n) {
        	if(k > (n-1)) {
        		reverse(arr,l,n-1);
        		break;
        	}
            reverse(arr,l,r);
            
            l = l+k;
            
            r = Math.min(n-1,(r+k));
        }
    }
    
    
    static void reverse(List<Integer> arr,int l, int r) {
        
       while(l<r) {
           int left = arr.get(l);
           int right = arr.get(r);
           
           arr.set(l,right);
           arr.set(r,left);
           
           l=l+1;
           r = r-1;
       }
    }
   
	 public static String firstLineChar =  "ertabdfyh";
	    //COMPLETE THIS FUNCTION
	    private static void process(String input) {
	        String[] arr = input.split(" ");
	        
	        Map<Integer,String> map = new HashMap<>();
	        for(String st: arr) {
	            String [] t = st.split("");
	            for(String temp: t) {
	                if(!firstLineChar.contains(temp)){
	                    break;
	                }
	            }
	            
	            map.put(st.length(),st);
	        }
	        
	        
	        
	        System.out.println(input);
	    }
	
	static int binarysearch(int arr[], int n, int k) {
        return binSearch(arr,k,0,n-1);
		
    }
	
	static int binSearch(int arr[],int k,int left,int right) {
		
		if(left > right) {
			return -1;
		}
		int half = (left+right)/2;
		
		int halfVal = arr[half];
		if(halfVal == k) {
			return half;
		} else if(k > halfVal) {
			return binSearch(arr,k, half+1, right);
			
		} else {
			return binSearch(arr,k, left, half-1);
			
		}
		
	}
	

	
	
	  //Function to dele middle element of a stack.
    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        int middle = (sizeOfStack+1)/2;
        d(s,sizeOfStack,0);
        
        for(int i=1;i<sizeOfStack;i++) {
        	System.out.print(s.pop()+" ");
        }
    } 
    
    public static void d(Stack<Integer>s,int size,int cIdx) {
        
        if(cIdx == (size/2)) {
        	s.pop();
        	return;
        }
        
        Integer ele = s.pop();
        cIdx++;
        d(s,size,cIdx);
        
        s.push(ele);
        
    }
}


@FunctionalInterface
interface MyInterface {
	int doOperation(int a,int b);
	
	static void staticMethod() {
		System.out.println("this is static method");
	
	}
	
	default void defaultMethod() {
		System.out.println("this is default method");
	}
	 String toString();
	 boolean equals(Object obj);
	int hashCode();
}



