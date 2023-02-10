package core.java;

public class DiamondTest {
	public static void main(String args[]) {
		B i = () -> {
			System.out.println("ehho world");
		};
		
		MyFunctionalInterface i2 = new MyFunctionalInterface() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		i.a();
		i.test();
		
	}
	
	static interface A {
		void a();
		default void test() {
			System.out.println("Hello everyone how are you");
		}
		
		static void test2() {
			System.out.println("This is static method of test2 method");
		}
	}
	
	static interface B extends A {
		void a();
	 @Override
	default void test() {
		// TODO Auto-generated method stub
		A.super.test();
	}
		
	}
	
	@FunctionalInterface
	static interface MyFunctionalInterface {
		int sum(int a, int b);
	}
	static class check  implements A,B {

		@Override
		public void a() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
