package core.algo.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SieveOfEratothenes {

	public static void main(String[] args) {
		boolean [] arr = getPrimeNumber(20);
		
		System.out.println(powLog(5,10));
	}
	
	
	public static int powLog(int a,int b) {
		if(b ==0) {
			return 1;
		}
		//In case odd power
		if( (b&1) != 0) {
			return powLog(a, (b/2)) * powLog(a,b/2) *a;
		} else
		return powLog(a, b/2) * powLog(a,b/2);
	}
	
	public static int pow(int a,int b) {
		if(b ==0) {
			return 1;
		}
		
		return a*pow(a, b-1);
	}
	public static int fact(int a) {
		if(a == 1) {
			return 1;
		}
		
		return fact(a-1)*a;
		
	}
	public static void printDI(int n) {
		if(n <= 0) {
			return; 
		}
		
		
		System.out.println(n);
		printDI(n-1);
		System.out.println(n);
		
	}
	
	public static List<String> find_permutation(String s) {
       List<String> str = new ArrayList<>();
       
       if(s.length() == 1) {
    	   str.add(s);
    	   return str;
       }
       
       for(int i=0;i<s.length();i++) {
    	   String firstChar = s.split("")[i];
    	   String tempStr = new StringBuilder(s).deleteCharAt(i).toString();

    	   List<String> temp = find_permutation(tempStr);
    	   for(String st: temp) {
    		   String ab = firstChar+st;
    		   str.add(ab);
    	   }
       }
       
       Set<String> set = new TreeSet<>(str);
       str.clear();
       str.addAll(set);
       return str;
    }
	
	public static void printIncreasing(int n) {
		if(n <= 0) {
			return; 
		}
		
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	public static void printDecreasing(int n) {
		if(n <= 0) {
			return; 
		}
		
		System.out.println(n);
		printIncreasing(n-1);
		
	}
	
	public static void printNos(int N) {
		if(N > 0) {
			printNos(N-1);
			System.out.print(N+" ");
		}
    }

	public static boolean xyz(int no) {
		
		for(int i=1;i<=10;i++) {
			if(no % i !=0) {
				return false;
			} 
			
		}
		
		return true;
	}
	public static int abc(int n) {
		
        int num; //Declare the number
        System.out.println("Enter the number");
        num=n;    //Initialize the number
        
        int sum=0;   //Variable to calculate the sum
        int i=0;
        while(i<100) {
            sum=sum+i;
            sum = i+sum;
            
            i+=1;
        }
        return sum;
	}
	
	public static boolean[] getPrimeNumber(int no) {
		boolean [] arr = new boolean[no+1];
		
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
		
		for(int i=2;i*i<= no;i++) {
			
			for(int j=i*2; j <= no;j=j+i) {
				arr[j]=false;
			}
		}
		
		return arr;
	}

}
