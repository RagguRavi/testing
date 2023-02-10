package functional_programming.concurrency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(200);
		Counter counter = new Counter();
		MyCallabel run = new MyCallabel(counter);
		
		Callable<Integer>  c = () -> {
			counter.check1();
			return counter.getJ();
		};
		
		Callable<Integer>  c1 = () -> {
			counter.check2();
			return counter.getJ();
		};
		
		/*
		List<Callable<Integer>> li1 = List.of(c,c,c,c,c,c,c,c,c,c,c);
		
		List<MyCallabel> li = List.of(run,run,run,run,run,run,run,run,run,run,run);
		
		List<Callable<Integer>> l= new ArrayList<>();
		l.addAll(li1);
		l.addAll(li);
		es.invokeAll(l);
		System.out.println(counter.get()+"\t"+li.size());
		*/
		
		es.invokeAll(List.of(c,c1));
		es.shutdown();
		
		Set<String> s = new HashSet<>();
		
		float f = 7/2 +1;
		System.out.println(Math.ceil(f));
		
	}
}

class MyCallabel implements Callable<Integer> {
	Counter counter;
	
	public MyCallabel(Counter counter) {
		 this.counter = counter;
	}

	@Override
	public Integer call() throws Exception {
		counter.increment();
		return counter.get();
	}
	
	
}
