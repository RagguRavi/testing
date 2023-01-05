package functional_programming;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP05 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,2,3,3,4,4,4,5,5);
		
		System.out.println(
		list.stream().collect(
				
					Collectors.groupingBy(Integer::intValue,Collectors.counting())
					
				).values().stream().mapToInt(Long::intValue).max()
		);

		//		printOddNumbers();
//		checkPerformance();
	}
	
	public static void printOddNumbers() {
		IntStream.iterate(2, i -> 2*i).limit(10).peek(System.out::println).sum();
	}
	
	public static void checkPerformance() {
		Long time = System.currentTimeMillis();
		
//		IntStream.iterate(2, a ->a*2).limit(10).forEach(System.out::println);
//		Stream.iterate(BigInteger.TWO, a -> a.multiply(BigInteger.valueOf(12373237))).limit(500).forEach(System.out::println);
		
		System.out.println(
		LongStream.range(1, 1_00_00_00_000).parallel().sum()
		);
		/*
		 * System.out.println( LongStream.range(1,
		 * 10).mapToObj(BigInteger::valueOf).reduce(BigInteger.TWO, (x,y) ->
		 * x.multiply(y)) );
		 */
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
