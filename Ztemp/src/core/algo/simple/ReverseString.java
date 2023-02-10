package core.algo.simple;

import java.util.Arrays;

public class ReverseString {
	public static void main(String args[]) {
		System.out.println(reverseWords("i.like.this.program.very.much"));
		System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
	}
	
	 static String reverseWords(String S)
	    {
	       StringBuffer sb = new StringBuffer();
	       String arr[] = S.split("\\.");
	       System.out.println(Arrays.toString(arr));
	       for(int i=arr.length-1;i>=0;i--) {
	           sb.append(arr[i]).append(".");
	       }
	       
	       return sb.substring(0,sb.length()-1).toString();
	    }
	 
	 
	 public static boolean isAnagram(String a,String b)
	    {
		 if(a.length() != b.length())
			 return false;
		 
		char arr1[] = a.toCharArray();
		char arr2[] = b.toCharArray();
		 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	      for(int i=0;i<arr1.length;i++) {
	    	  	if(arr1[i] != arr2[i]) {
	    	  		return false;
	    	  	}
	      } 
	        return true;
	    }
}
