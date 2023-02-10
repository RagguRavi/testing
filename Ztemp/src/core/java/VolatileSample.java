package core.java;

public class VolatileSample {
	static volatile int MY_INT = 0;
	public static void main(String args[]) {
		MyClass m1 = new MyClass();
		
		Runnable r1 = () -> m1.printNumber();
		Runnable r2 = () -> m1.printNumber();
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		
	}
	
	
	static class MyClass  {
		public void printNumber() {
			int local_valu = MY_INT;
			while(local_valu < 15) {
				System.out.println(MY_INT +"\t" + Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				MY_INT = local_valu++;
			}
		}
	}
}
