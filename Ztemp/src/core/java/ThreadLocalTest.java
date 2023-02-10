package core.java;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {
	private static ThreadLocal<Integer> val = new ThreadLocal<>();
	private static Integer a = -1;
	
	
	public static ThreadLocal<Integer> getVal() {
		return val;
		
	}


	public static void setVal(Integer val) {
		ThreadLocalTest.val.set(val);
		a = val;
	}

	static Random random = new Random();

	public static void main(String[] args) throws Exception {
	
		
		ExecutorService pool = Executors.newFixedThreadPool(100);
		for(int i=0;i<10;i++) {
			pool.submit(
					() -> {
						int in= random.nextInt(100);
						System.out.println(Thread.currentThread().getName() +" "+ val.get() +" setting value: "+in);
						
						ThreadLocalTest.setVal(in);
//						ThreadLocalTest.a=in;
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() +" "+ val.get()+"  a value is "+ThreadLocalTest.a);
					}
					);
			
		}

	}
}
