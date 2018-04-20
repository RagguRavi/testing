package core.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temp17 {
	public static void main(String[] args) {
		int arr[] = { 2, 34, 4, 3, 2, 5, 6, 7, 6, 5, 4, 2 };
		int qan[] = Temp17.distinctElementArray(arr);
		for (int i : qan)
			System.out.print(i + ",");
	}

	public static int[] distinctElementArray(int arr[]) {
		List<Integer> result = new ArrayList<>();
		boolean available;
		for (int i = 0; i < arr.length; i++) {
			available = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					available =true;
					break;
				} 
			}
			
			if(!available) {
				result.add(arr[i]);
			}
		}
		int aaa[] = new int[result.size()];
		Iterator<Integer> it = result.iterator();
		int i = 0;
		while(it.hasNext()) {
			int a= it.next();
			aaa[i++] = a;
		}
		return aaa;
	}

}
