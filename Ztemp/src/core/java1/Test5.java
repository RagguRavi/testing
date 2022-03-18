package core.java1;

public class Test5 {
	public static void main(String args[]) {
		I5 i = (int a, int b) -> a+b;
		System
		.out.println(i.sum(3, 56));
	}
}

interface I5 {
	int sum(int a, int b);
}