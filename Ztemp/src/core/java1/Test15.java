package core.java1;

public class Test15 implements Int1 {

	public static void main(String[] args) {
		Test15 t = new Test15();
		t.isNull("");
		
	}

	 boolean isNull(String str) {
		 try {
		 System.out.println("Class is null method");
		 return false;
		 } finally {
			System.out.println("this is finally block");
		}
		 
	 }
}

interface Int1 {
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return false;
	}
}
