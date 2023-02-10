package core.algo.StringDS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LongestDistinctCharacters {
	public static void main(String[] args) {
		String str = "aewergrththy";
		longestSubstrDistinctChars2(str);
	}
	
	static int longestSubstrDistinctChars2(String S){
		
		HashSet<Character> set = new LinkedHashSet<>();
		int max = 0;
		
		for (char c : S.toCharArray()) {
			boolean isExist = set.contains(c);
			if(isExist) {
				System.out.println(set.toString());
				int currentSize = set.size();
				if(currentSize > max) {
					max = currentSize;
				}
				
				set.clear();
				set.add(c);
			} else {
				set.add(c);
			}
		}
		
		System.out.println(max);
        
		return max;
    }


	static int longestSubstrDistinctChars(String S){
		int max = 0;
		for (int i = 0; i < S.length(); i++) {
			String st = getStrFromIdx(S, i);
			if(st.length() > max) {
				max = st.length();
			}
		}
		
		System.out.println(max);
		return max;
    }
	
	static String getStrFromIdx(String st, int idx) {
		HashSet<Character> set = new LinkedHashSet<>();
		StringBuffer sb = new StringBuffer();
		char[] ch = st.substring(idx).toCharArray();
		for(char c: ch) {
			boolean isExist = set.add(c);
			if(!isExist) {
				return sb.toString(); 
			} else {
				sb.append(c);
			}
		}
		
		return sb.toString();
		
	}
}
