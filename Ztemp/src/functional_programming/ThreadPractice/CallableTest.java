package functional_programming.ThreadPractice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	
	public static void main(String[] args) throws InterruptedException {
		CallableTask ct = new CallableTask("Ravi Kumar");
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks =  List.of(new CallableTask("Ravi"),new CallableTask("Kumar"),new CallableTask("Tholiya"),new CallableTask("Prajapat"));
		
		List<Future<String>> results = es.invokeAll(tasks);
		System.out.println("Callable done");
		
		try {
			for(Future<String> s : results) {
				System.out.println(s.get());
			}
			System.out.println("main Ends");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
	}
}
