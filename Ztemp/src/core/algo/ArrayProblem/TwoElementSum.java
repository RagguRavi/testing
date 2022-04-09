package core.algo.ArrayProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoElementSum {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(2,11,15,7);
		int target = 9;
		
		System.out.println(secondWay(list, target));
	}
	
	
	public static List<Integer> getSumInx(List<Integer> list,int sum) {
		List<Integer> idx = new LinkedList<Integer>();
		for(int i=0;i<list.size();i++) {
			for(int j = i;j<list.size();j++) {
				int sumTemp = list.get(i) + list.get(j);
				if(sumTemp == sum) {
					return Arrays.asList(i,j);
				}
			}
		}
		return idx;
	}
	
	
	public static List<Integer> secondWay(List<Integer> list,int sum) {
		Map<Integer,Integer> map = new HashMap();
		
		for(int i=0;i<list.size();i++) {
			int complement = sum - list.get(i);
			if(map.containsKey(complement)) {
				return Arrays.asList(map.get(complement),i);
			}
			
			map.put(list.get(i), i);
		}
		return null;
	}
}
