package core.algo.StringDS;

import java.util.*;
import java.util.Map.*;
import java.util.function.*;
import java.util.stream.*;


public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String st = "zxvczbtxyzvy";
		
		
		/*
		 * Predicate<Entry<Character, Long>> pre = e -> e.getValue() > 1;
		 * Optional<Entry<Character, Long>> ch = st.chars().mapToObj(c ->
		 * Character.valueOf((char)c)).
		 * collect(Collectors.groupingBy(Character::charValue,LinkedHashMap::new,
		 * Collectors.counting())) .entrySet().stream().filter(pre).findFirst();
		 * 
		 * 
		 * if(ch.isPresent()) { System.out.println(ch); }
		 */
		
		nonrepeatingCharacter1(st);
	}
	
	static char nonrepeatingCharacter(String st)
    {
		Predicate<Entry<Character, Long>> pre = e -> e.getValue() > 1;
		Optional<Entry<Character, Long>> ch = st.chars().mapToObj(c -> Character.valueOf((char)c)).
			collect(Collectors.groupingBy(Character::charValue,LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream().filter(pre).findFirst();
		
		
		if(ch.isPresent()) {
			return ch.get().getKey();
		} else {
			return '$';
		}
		
    }
	
	static char nonrepeatingCharacter1(String st) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c: st.toCharArray()) {
			if(map.containsKey(c)) {
				Integer v = map.get(c);
				map.put(c, v+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> en : map.entrySet()) {
			if(en.getValue() > 1) {
				return en.getKey();
			}
		}
		System.out.println(map);
		return '$';
		
    }
}
