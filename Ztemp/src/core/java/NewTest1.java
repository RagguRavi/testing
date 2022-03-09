package core.java;

import java.util.Calendar;

public class NewTest1 {
	public static void main(String[] args) throws Exception {
		int a = 012;
		System.out.println(a);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 11);
		System.out.println(calendar.getTime());
	}
	private static void hello() {
		
	}
}



class abcd extends NewTest1{
	public void m1() {
		
	}
	
}


interface interface1 {
	static void name() {
		
	}
	default void hello() {
		
	}
}