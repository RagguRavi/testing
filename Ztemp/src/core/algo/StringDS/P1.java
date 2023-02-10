package core.algo.StringDS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {

	public static void main(String[] args) {
		String arr[] = {"hello", "world"};
		
		System.out.println(longestCommonPrefix(arr, arr.length));
		
		
	}
	
	  public static String reverseWord(String str) {
	       char [] chr = str.toCharArray();
	       StringBuffer sb = new StringBuffer();
	       
	       for(int i=chr.length-1;i>=0;i--) {
	    	   sb.append(chr[i]);
	       }
	       
	       
	       return sb.toString();
	    }
	  
	  
	  
	  static String longestCommonPrefix(String arr[], int n){
	        StringBuffer st = new StringBuffer();
	        int minLength = Arrays.stream(arr).mapToInt(String::length).min().getAsInt();
	        
	        for(int i = 0;i<minLength;i++) {
	        	boolean isSame = isSameAtIndex(arr, n, i);
	        	if(isSame) {
	        		st.append(arr[0].charAt(i));
	        	} else {
	        		break;
	        	}
	        }
	        
	      if(st.length() == 0) {
	    	  return "-1";
	      }
	      
		  return st.toString();
	    }
	  
	  static boolean isSameAtIndex(String arr[],int n,int idx) {
		  char ch = '~';
		  for(String st: arr) {
			  if(ch == '~') {
				  ch = st.charAt(idx);
			  }else if(!(st.charAt(idx) == ch)) {
				  return false;
			  }
		  }
		  
		  return true;
	  }
}
