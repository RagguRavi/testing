package functional_programming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class FP03 {

	public static void main(String args[]) {
		List<Integer> list = List.of(3, 54, 65, 12, 16, 98, 5, 0, 34, 76, 87);
		IntStream intStream = IntStream.of(3, 54, 65, 12, 16, 98, 5, 0, 34, 76, 87);
		
		Predicate<Integer> evenPredicate = x -> x % 2 == 0;
//		System.out.println(evenPredicate.test(347));

		Consumer<Integer> printConsumer = x -> System.out.println(x);
//		printConsumer.accept(5);
		
		BinaryOperator<Integer> sumOperator = (x,y) -> x+y;
//		System.out.println(sumOperator.apply(4, 5));
		
		Function<Integer, String> myFunction = x -> x+" Tsbi ";
//		System.out.println(myFunction.apply(45));

		Supplier<String> mySupplier = () -> "Jai Shri Ram";
//		System.out.println(mySupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> x/3;
//		System.out.println(unaryOperator.apply(33));
		
		BiPredicate<Integer, Integer> eqalPredicate = (x,y) -> x==y;
		System.out.println(eqalPredicate.test(4, 4));
		
		BiFunction<Integer, Integer, String> joinNumbers = (x,y) -> x+""+y;
		System.out.println(joinNumbers.apply(38, 4));
		
		BiConsumer<String, Integer> biConsumer = (a,b) -> System.out.println(a+" "+b);
		biConsumer.accept("ravi", 4);
		
		
		System.out.println(intStream.sum());
		
	}
}
