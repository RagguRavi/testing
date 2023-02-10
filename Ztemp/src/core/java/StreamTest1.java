package core.java;

import java.util.stream.IntStream;

public class StreamTest1 {
	public static void main(String args[]) {
		int sum = IntStream.range(1, 6).parallel().reduce((a,b) -> a).getAsInt();	
		System.out.println(sum);
	}
}
