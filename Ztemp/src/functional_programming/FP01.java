package functional_programming;

import java.util.ArrayList;
import java.util.List;

public class FP01 extends FP02 {
	public static void main(String args[]) {
//		printNumbersStructured(List.of(3,54,65,12,16,98,5,0,34,76,87));
//		System.out.println("-----------------------");
//		printNumbers(List.of(3,54,65,12,16,98,5,0,34,76,87));
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
//		excersie4(courses);
		listOperations(new ArrayList<>(courses));
		
	}

	private static void printNumbersStructured(List<Integer> of) {
		for(Integer i: of) {
			System.out.println(i);
		}
		
	}

	private static void printNumbers(List<Integer> of) {
		 of.stream().filter(i ->i%2 != 0).forEach(System.out::println);
	}
	
	
	public static void excersie2(List<String> courses) {
		courses.forEach(System.out::println);
	}
	
	public static void excersie3(List<String> courses) {
		courses.stream().filter(co -> co.contains("Spring")).forEach(System.out::println);
	}
	public static void excersie4(List<String> courses) {
		courses.stream().filter(co -> co.length() >=4 ).forEach(System.out::println);
	}
	
	public static void listOperations(List<String> list) {
		list.removeIf(a -> a.length()<4);
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
	}
	
	
}
