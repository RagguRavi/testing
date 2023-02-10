package core.algo.simple;

import java.util.ArrayList;
import java.util.List;

public class PrintFibbonaci {
	public static void main(String argss[]) {
		List<Integer> li = new ArrayList<>();
		li.add(0);
		li.add(1);
		
		
		int tillNo = 20;
		
		for(int idx = 2;idx<=tillNo;idx++) {
			int sum = li.get(idx-1) + li.get(idx-2);
			li.add(sum);
		}
		
		System.out.println(li);
	}
}
