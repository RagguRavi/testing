package core.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Temp26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="/NDE/staff/create";
		System.out.println(str.endsWith("create"));
		
		List<Integer> list = Arrays.asList(2,3,4,5,6,3,2,66,55,4,0,6,4);
		
		list = list.stream().sorted((i,j) -> {
			return j-i;
		}).collect(Collectors.toList());
		
		System.out.println(list);
		
		Long l1= 123l;
		Long l2= 122l;
		
		System.out.println(l2.compareTo(l1));
		
		Set<Integer> abc = new HashSet<>();
		
		abc.add(null);
		abc.add(null);
		System.out.println(abc.size());
		System.out.println(TempAB.a);
		
	}

}

class AbcClass<T> {
	T abc;

	public AbcClass(T obj) {
		abc = obj;
	}
	public T getAbc() {
		return abc;
	}

	public void setAbc(T abc) {
		this.abc = abc;
	}
	
}

 enum TempA {
	A,B,C,D;
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
}
 
 class TempAB {
	 final static TempAB a= new TempAB();
	 
	 static {
		 System.out.println("SIB -> temAP");
	 }
	 {
		 System.out.println("IIB -> tempAB");
	 }
 }