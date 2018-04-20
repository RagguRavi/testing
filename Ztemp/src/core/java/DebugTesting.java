package core.java;

public class DebugTesting {
public static void main(String[] args) {
//	DebugTesting debug=new DebugTesting();
	int variable=0;
	variable=234324;
	B b=new B();
	System.out.println(b);
	System.out.println(variable);
	
}

int show() {
	System.out.println("this is show methode");
	return 123;
}

String display() {
	System.out.println("this is display methhode");
	return "hello everyobe";
}

void m1() {
	System.out.println("this is m1 methode");
}
}

class A{
	public A() {
		System.out.println("A()");
	}
	{
		System.out.println("IIB in A");
	}
}

class B extends A{
	public B() {
		System.out.println("B()");
	}
	{
		System.out.println("IIB of B");
	}
}
