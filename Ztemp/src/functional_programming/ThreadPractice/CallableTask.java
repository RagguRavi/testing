package functional_programming.ThreadPractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTask implements Callable<String> {

	String name;
	
	public CallableTask(String name) {
		 this.name = name;
	}

	@Override
	public String call() throws Exception {
		System.out.println("I am in callable "+name +" "+Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println("Done callable "+name+" "+Thread.currentThread().getName());
		return name;
	}

}
