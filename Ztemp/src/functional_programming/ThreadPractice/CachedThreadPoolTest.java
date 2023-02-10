package functional_programming.ThreadPractice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CachedThreadPoolTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		
		List<CallableTask> tasks =  List.of(new CallableTask("Ravi"),new CallableTask("Kumar"),new CallableTask("Tholiya"));
		
		List<Future<String>> results = es.invokeAll(tasks);
		
		System.out.println("Callable done");
		
		
		results = es.invokeAll(tasks);
		
		
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
