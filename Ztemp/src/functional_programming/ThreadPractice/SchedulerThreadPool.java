package functional_programming.ThreadPractice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.joda.time.LocalDateTime;

public class SchedulerThreadPool {
	
	 // Create a task
	  static Runnable task1 = () -> {
	   System.out.println("Executing the task1 at: " + new LocalDateTime());
	  };
	  
	public static void main(String[] args) throws InterruptedException {

		ScheduledExecutorService  es = Executors.newScheduledThreadPool(4);
		System.out.println("Run after 5 seconds from: " + new LocalDateTime());
//		es.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
		es.schedule(task1, 5, TimeUnit.SECONDS);
		
		es.shutdown();
	
	}
}
