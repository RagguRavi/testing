package core.java1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		String p[] = new String[] {"a","b","c","d","e","f","g"};
		Stream<String> st =  Arrays.stream(p);

		System.out.println(st);
		
		Stream<String> builder = Stream.<String>builder().add("a").add("c").add("d").build();
		
		Stream<String> generate = Stream.generate(() ->"element").limit(10);
//		generate.forEach(System.out::println);
		
		IntStream iStream = IntStream.range(1, 400000000);
		
//		iStream.forEach(System.out::println);
		
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		
		Optional<Integer> opt	= number.stream().findFirst();
		System.out.println(opt.get());
		//square.forEach(System.out::println);
	}
	
	private static int a=1;
	private static void abc() {}

}
