package functional_programming.ThreadPractice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnytTest {
	
	public static void main(String[] args) throws InterruptedException {
		CallableTask ct = new CallableTask("Ravi Kumar");
		
		ExecutorService es = Executors.newFixedThreadPool(5);
//		Executors.ne
		
		List<CallableTask> tasks =  List.of(new CallableTask("Ravi"),new CallableTask("Kumar"),new CallableTask("Tholiya"),new CallableTask("Prajapat"));
		
		
		
		try {
			String results = es.invokeAny(tasks);
			System.out.println("Callable done");
			System.out.println(results);
			System.out.println("main Ends");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
	}
}
