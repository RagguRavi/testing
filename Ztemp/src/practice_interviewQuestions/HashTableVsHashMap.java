package practice_interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;


public class HashTableVsHashMap {
	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(null, "value");
		map.put("key1", null);
		System.out.println(map.put("key2", "ravi"));
		
//		map.forEach((k,v) -> System.out.println(k+"\t"+v));
		
		Hashtable<String, String> hashTable = new Hashtable<>();
//		hashTable.put(null, "value");
//		hashTable.put("key1", null);
//		hashTable.put("key2", null);
		
//		hashTable.forEach((k,v) -> System.out.println(k+"\t"+v));
	}
	
	
}


class MyClass extends HashTableVsHashMap {
	
}
