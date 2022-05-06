package core.algo.bitManupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinXORValue {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(4);
		list.add(6);
		list.add(2);
		
		System.out.println(findMinXor(list));

	}
	
	 public static int findMinXor(ArrayList<Integer> list) {
	    Collections.sort(list);
	    
	    int a = list.get(0);
	    
	    int result = Integer.MAX_VALUE;
	    for(int i=1;i<list.size();i++) {
	    	int temp = a ^ list.get(i);
	    	if(temp<result) {
	    		result=temp;
	    	}
	    }
	    
	    return result;
	 }

}
