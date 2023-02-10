package core.collectionTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 implements Runnable {
	static Map<Integer,String> map = new HashMap<>();
	public static void main(String args[]) {
		
		
		map.put(1, "ravi");
		map.put(2, "ravi2");
		map.put(3, "ravi3");
		map.put(4, "ravi4");
		map.put(5, "ravi5");
		
		Test1 t = new Test1();
		Thread th = new Thread(t);
		th.start();
		
		for(Entry<Integer, String> e: map.entrySet()) {
			map.put(e.getKey(), e.getValue()+"_"+1);
			
		}
		
		System.out.println(map);
		
		List<String> li  = new LinkedList<>();
	}
	@Override
	public void run() {
		
		map.put(6, "test");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
