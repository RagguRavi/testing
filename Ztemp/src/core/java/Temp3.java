package core.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Temp3 {

	public static void main(String[] args) {
		
//		firstInterface<SuperClass> firstInterfacc=SuperClass::new;
//		System.out.println(firstInterfacc.hello());

		Integer arr[]= {2,3,4,5,2,5,6,763,3,5,3};
		List<Integer> list=Arrays.asList(arr);
		
		System.out.println(list);
//		List li=list.stream().distinct().collect(Collectors.toList());
//		System.out.println(li);
		List l2=list.stream().filter((val)->val>=5).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}
}

@FunctionalInterface
interface firstInterface<T>
{
	
	T hello();
}


class SuperClass implements Predicate<Integer>
{

	String name;
	
	
	
	public SuperClass(String name) {
		this.name = name;
	}


	public String toString() {
		return "SuperClass [name=" + name + "]";
	}


	public static int show(firstInterface first)
	{
		System.out.println("This is  methode in superclass ");
		return 2334;
	}


	public boolean test(Integer arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}