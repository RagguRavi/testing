package functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP08 {
	public static void main(String[] args) {
		test1();
		
	}
	
	public static void test2() {
		Map<String,Integer> map = Map.of("ravi",10,"Nitin",2,"roni",5,"nimr",9,"ruo",1);
		HashMap<String,Integer> ma = new HashMap<>(map);
		Comparator<Entry<String, Integer>> comp = (e1,e2) -> e1.getValue().compareTo(e2.getValue());
		ma.entrySet().stream().sorted(comp.reversed()).forEach(System.out::println);;
		
//		ma.entrySet().stream().collect(Collectors.toMap(Entry::getKey, Entry::value));
		
		
	}
	
	static public void test1() {
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));
		
		
		Map<Integer,List<Book>> ma = bookList.stream().collect(Collectors.groupingBy(Book::getReleaseYear));
		System.out.println(ma);
		
		Map<Integer,Book> str = 	bookList.stream().collect(
					Collectors.toMap(Book::getReleaseYear, Function.identity(),
							(existing,replacement) -> existing		
					)
			);
	
		System.out.println(str);
		
		

		Map<Integer,Book> str1 = 	bookList.stream().collect(
					Collectors.toMap(Book::getReleaseYear, Function.identity(),
							(o1,o2) -> o1, ConcurrentHashMap::new		
					)
			);
		
		System.out.println(str.getClass() +" "+ str1.getClass());
	}
	
	
	
	
}
