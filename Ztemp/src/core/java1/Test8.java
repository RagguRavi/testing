package core.java1;

import java.util.HashMap;
import java.util.Map;

public class Test8 {

	public static void main(String[] args) {
		String str = "raavvviii";
		Map<String,Integer> strMap = new HashMap<>();
		String[] arr = str.split("");
		
		for(String st:arr) {
			if(strMap.containsKey(st)) {
				Integer count = strMap.get(st);
				count = count+1;
				strMap.put(st, count);
			} else {
				strMap.put(st, 1);
			}
		}
		
		System.out.println(strMap);
	}
	
	
	

}
