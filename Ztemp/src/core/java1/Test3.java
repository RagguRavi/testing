package core.java1;


@FunctionalInterface
interface I1 {
	int sum(int i, int j);
	
}
public class Test3 {
	public static void main(String args[]) {
		I1 i = (int a, int b) -> a+b;
		
		System.out.println(i.sum(23, 43));
	}
}
