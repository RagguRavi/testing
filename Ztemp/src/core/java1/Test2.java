package core.java1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) throws Exception {
		List<Integer> numbers = Arrays.asList(1,2,34,5,67,7,5,3,2);
		
		List<Integer> eventNumbers = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.print(eventNumbers);
		
		String str = "";
		;
		
		/*
		 * try(){
		 * 
		 * }
		 */

	}

}
