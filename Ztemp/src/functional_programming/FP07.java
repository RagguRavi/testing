package functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class FP07 {

	public static void main(String[] args) {
		Predicate<Integer> divideBy5= x -> x%5==0;
		Predicate<Integer> divideBy2= x -> x%2==0;
		
		List<Integer> li = List.of(10,15,20);
		
		Predicate<Integer> divideBy2And5 = divideBy5.and(divideBy2);
		
//		System.out.println(divideBy2And5.test(15));
		
		Predicate<Integer> divideBy5AndEven = divideBy5.and(x -> x%2 == 0);
		
		System.out.println(divideBy5AndEven.test(49830));
		

	}
	
	static class A {
		A(int a, String b) {
			
		}
	}

	class B extends FP07.A {

		B(int a, String b) {
			super(a, b);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
}
