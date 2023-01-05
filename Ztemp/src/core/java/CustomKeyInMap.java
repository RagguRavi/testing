package core.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomKeyInMap {
	
	static class MyKeyClass  {
		private Long id;
	
		public MyKeyClass(Long id) {
			this.id = id;
		}
	}

	
	public static void main(String[] args) {
		/*
		 * Map<MyKeyClass, String> map = new TreeMap<>(); map.put(new MyKeyClass(1l),
		 * "ravi");
		 * 
		 * System.out.println(map);
		 */
		
System.out.println(Long.valueOf("bacd"));
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		Future<String> fu =  es.submit(() -> {
			return "ravi";
		});
		
		
		String a = "23441";
		Pattern pattern = Pattern.compile("[0-9]+");
		if(pattern.matcher(a).matches()) {
			System.out.println("Oooo yea");
		}
		
		
		boolean exists = a.chars().allMatch(ch -> ch >= '0' && ch <= '9');
		System.out.println(exists);
		
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(9);
		
		System.out.println(list);
		
		ListIterator<Integer> lit =  list.listIterator();
		while(lit.hasNext()) {
			if(lit.next() == 5)
			lit.remove();
		}
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) == 6) {
				list.remove(i);
			}
		}
		
		list.removeIf(ele -> ele == 9);
		
		System.out.println(list);
		
	}
}
