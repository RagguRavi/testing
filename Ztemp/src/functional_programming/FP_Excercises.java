package functional_programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP_Excercises {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,5,7,10,6,4,5,7);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
//		excercise07(list);
//		excercise08(list);
//		excercise09(list);
//		excercise10(list);
//		excercise11(courses);
//		excercise12(list);
		excercise13(list);
	}

	//Square every number in a list and find the sum of squares
	 static void excercise07(List<Integer> list) {
		int sum = list.stream().map(no -> no*no).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
	}
	
	 
	 //Cube every number in a list and find the sum of cubes
	 static void excercise08(List<Integer> list) {
		int sum = list.stream().map(no -> no*no*no).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
	}
	
	 //Find Sum of Odd Numbers in a list
	 static void excercise09(List<Integer> list) {
		int sum = list.stream().filter(no -> no % 2 != 0).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
	}
	 
	 //Create a List with Even Numbers Filtered from the Numbers List
	 static void excercise10(List<Integer> list) {
			List<Integer> evenNumberList = list.stream().filter(no -> no % 2 == 0).collect(Collectors.toList());
			System.out.println(evenNumberList);
		}
	 
	 //Create a List with lengths of all course titles.
	 static void excercise11(List<String> courses) {
			List<Integer> lengthCountStr = courses.stream().map(str -> str.length()).collect(Collectors.toList());
			System.out.println(lengthCountStr);
		}
	 
	 /*
	  Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.

	int sum = numbers.stream() .reduce(0, Integer::sum);
	  */
	 
	 static void excercise12(List<Integer> list) {
		
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		int sum = list.stream() .reduce(0, accumulator);
		System.out.println(sum);
	}
	 
	 
	/*
	 Do Behavior Parameterization for the mapping logic.

		List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());
	 */
	 
	static void excercise13(List<Integer> numbers) {
		Function<Integer, Integer> mapper = x -> x * x;
		Function<Integer, Integer> cubeMapper = x -> x * x* x;
		
		calculateAndPrint(numbers, cubeMapper);
		calculateAndPrint(numbers, mapper);

	}

	private static void calculateAndPrint(List<Integer> numbers, Function<Integer, Integer> mapper) {
		numbers.stream().map(mapper).forEach(System.out::print);
	}
	 
}
