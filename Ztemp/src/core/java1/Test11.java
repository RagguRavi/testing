package core.java1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test11 {
	public static void main(String [] args) {
		String str = removeCharFromString("nitraviin",'i');
		int a = 012;
		System.out.println(a);
		System.out.println(reverseUsingRecursion("RadArabced"));
	}
	
	
	public static String reverseUsingRecursion(String str) {
			if(str.length() == 1) {
				return str;
			}
		
			return str.charAt(str.length()-1) + reverseUsingRecursion(str.substring(0, str.length()-1));
	}
	public static boolean isStringPalindrome(String str) {
		StringBuffer sb = new StringBuffer();
		char []arr = str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--) {
			sb.append(arr[i]);
		}
		
		return sb.toString().equalsIgnoreCase(str);
	}
	public static String removeCharFromString(String str,char ch) {
		char [] chArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(char c: chArr) {
			if(c != ch) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	public static int getNthHighestNo(int ith) {
		List<Integer> list = Arrays.asList(2,11000,999,3,4,5,8,10,99,33,22,66);
		 Integer i = 	list.stream().sorted().collect(Collectors.toList()).get(list.size()-ith);
		 System.out.println(i);
		 
		 return i;
	}
	public static void printVanHackSequece() {
		int i = 0;
		List<Integer> list = new LinkedList<>();
		list.add(0);
		while(i<10) {
			
			int lastFoundIndex = list.lastIndexOf(i);
			int lastIndexElement = list.get(list.size()-1);
			if(lastFoundIndex == -1) {
				list.add(0);
			}else {
				list.add(i);
			}
			i++;
		}
		
		System.out.println(list);
	}
	
	
	
	public static int reverseNo(int no) {
		int n = 0;
		while(no > 0) {
			int temp = no%10;
			
			n = n*10+temp;
			
			no = no/10;
		}
		return n;
	}
	
	public static int secondHighest() {
		//Second highest value
				int [] arr = new int[]{10,2,9,13,18,4,8};
				
				int firstHightest = 0;
				int second =0;
				
				for(int i=0;i<arr.length;i++) {
					int preHight = firstHightest;
					if(arr[i] > firstHightest) {
						firstHightest = arr[i];
						second = preHight;
					} else if(arr[i] > second) {
						second = arr[i];
					}
					
					
				}	
				
				System.out.println(second);
				return second;
	}
}
