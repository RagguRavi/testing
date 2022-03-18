package core.java1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		List<String> tempList =	new ArrayList();
		
		
		
		  for(int i=0;i<list.size();i++) {
			  int temp = i+1; 
			  if(temp%2==0) {
				 // list.remove(i);
				  tempList.add(list.get(i));
				  
				  } 
			  }

		
		list.removeAll(tempList);
		System.out.print(list);
		
		
	}
}
