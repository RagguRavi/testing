package core.java1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	public static void main(String[] str) {
		ExecutorService es = Executors.newFixedThreadPool(100);
		
		for(int i=0;i<100;i++) {
			es.execute(new MyThread());
		}
	}
}


class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Guys"+this);
		double [] arr = new double[1000000000];
		for(int i=0;i<1000000000;i++) {
			arr[i] = 2003.234;
		}
	}
	
}