package functional_programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(3,54,65,12,16,98,5,0,34,76,87);
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
//		printSquare(list);
//		printCubeOfOddNumbers(list);
//		printNumberOfCharacters(courses);
		
//		myProblem();
//		checkFlatMap(courses);
		
		String st = "Ravi";
		StringBuffer sb = new StringBuffer();
		BigInteger bi = new BigInteger("4288036804899999999");
		
		bi = bi.add(BigInteger.ONE);
		
		System.out.println(bi.toString());
	}

	private static void myProblem() {
		String name = "Ravi Kumar";
		List.of(name.split("")).forEach(System.out::println);
		
	}

	private static void printNumberOfCharacters(List<String> courses) {
		courses.stream().map(course -> course.length()).forEach(System.out::println);
		
	}

	private static void printCubeOfOddNumbers(List<Integer> list) {
		list.stream().filter(number -> number%2 != 0).map(number -> (number*number*number)).forEach(System.out::println);
		
	}

	private static void printSquare(List<Integer> list) {
		list.stream().map(ele -> ele*ele).forEach(System.out::println);
		
	}
	
	public static void checkFlatMap(List<String> courses) {
		 courses.stream().map(co -> co.split("")).flatMap(Arrays::stream).forEach(System.out::println);
		 
		 System.out.println("============================================");
		
		List<List<String>> li = List.of(List.of("Rav","nitini"),List.of("Ron","nimrat"),List.of("Lakhvir","Rupin"),List.of("Raghu"));
		List<List<String>> l2 = List.of(List.of("Rav","nitini"),List.of("Ron","nimrati"),List.of("Lakhvir","Rupin"),List.of("Raghu"));
		
		/*
		 * System.out.println( li.stream().flatMap(Collection::stream).flatMap(a ->
		 * courses.stream().filter(b -> b.length() ==
		 * a.length()).map(c->List.of(c,a))).collect(Collectors.toList()) );
		 */
		
		System.out.println(
			li.stream().flatMap(Collection::stream)
			.flatMap(a ->l2.stream().flatMap(Collection::stream).
					filter(b -> b.length() == a.length()).map(c->List.of(c,a)))
			.filter(a -> !a.get(0).equals(a.get(1)))
			.collect(Collectors.toList()) 
		);
		
		
	}

}
