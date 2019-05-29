package core.p2;

import core.p1.A;
import hibernate.example.Student;

public class C extends A {
	public static void main(String[] args) {
		A b = new B();
		System.out.println(b.st);
//		b.show();
//		student st = null;
//		String []str = new String[3];
//		show(null);
	}
	
	static void show(String str) {
		System.out.println(str);
	}
	static void show(Student st) {
		System.out.println("studen st");
	}
}

class student {
	static {
		System.out.println("SIB student");
	}
}