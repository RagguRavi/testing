package functional_programming.ThreadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstExecutor {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		
//		ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(new Task(1));
		es.execute(new Task(2));
		
		es.execute(new Task(3));
		es.execute(new Task(4));
//		new Task3().start();
		
		System.out.println("\nMain Ends");
		
		es.shutdown();
	}
}
