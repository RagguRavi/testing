package core.algo.StringDS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
	}
	
	static String removeDups(String S) {
		Set<Character> set = new LinkedHashSet<>();
		for(char c: S.toCharArray()) {
			set.add(c);
		}
		StringBuffer sb = new StringBuffer();
		set.forEach(c -> sb.append(c));
		
		return sb.toString();
    }
}
