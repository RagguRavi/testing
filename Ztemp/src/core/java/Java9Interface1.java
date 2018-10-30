package core.java;

public interface Java9Interface1 {
	default String test1() {
		return "This is from default method in javvinterfac1";
	}
	
	public static void abc() {
		System.out.println("This is static method in interface1");
	}
}
