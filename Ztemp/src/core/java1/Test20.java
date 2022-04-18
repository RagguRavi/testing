package core.java1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test20 {
	public static void main(String args[]) {
		System.out.println(findFactorial(4));
		sortByValue();
	}
	
	public static int findFactorial(int i) {
		if(i == 1)
			return 1;
		
		return i*findFactorial(i-1);
	}
	
	public static void sortByValue() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
        hm.put("Math", null);
        hm.put("Data Structure", null);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        
        hm.values().stream().sorted().collect(Collectors.toList());
        
//        hm.entrySet().stream().sorted((m1,m2)->m1.getValue().compareTo(m2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).
	}
}
