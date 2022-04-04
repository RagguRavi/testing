package core.java1;

public class Test12 {

}

class A {
	public Object print() {
		System.out.println("A");
		return null;
	}
	
}


class B extends A {
	
	public String print() {
		System.out.println("B");
		return "B";
	}
}