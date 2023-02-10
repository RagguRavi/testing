package Test1;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String args[]) throws IOException {
		List sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
		
		System.out.println(Arrays.toString(sampleArray));
		
	}
}

