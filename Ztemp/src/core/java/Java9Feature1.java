package core.java;

public class Java9Feature1 implements Java9Interface,Java9Interface1 {
	public static void main(String[] args) {
		Java9Feature1 ovj = new Java9Feature1();
		ovj.testMain();
		Java9Interface.abc();
	}
	
	public void testMain() {
		System.out.println(Java9Interface.super.test1());
	}

	@Override
	public String test1() {
		// TODO Auto-generated method stub
		return Java9Interface1.super.test1();
	}
	
}


