package core.java;

import java.util.Arrays;
import java.util.List;

public class Temp20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MON";
		List<String> list = Arrays.asList(str.split(","));
		list.forEach(System.out::println);
		
		int a = 10;
		new A2(a == 10 ? "aaaa" : "value of a is 10" );
//		A.show(a == 10 ? "" : "value of a is 10");
	}

}


class A2 {
	A2(String a){
		System.out.println(a);
	}
	static void show(String str) {
		System.out.println(str);
	}
}