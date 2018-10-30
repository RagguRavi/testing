package core.java;

public interface Java9Interface {
	default String test1() {
		return "This is from default method";
	}
	
	public static void abc() {
		System.out.println("This is static method in interface");
	}
}
