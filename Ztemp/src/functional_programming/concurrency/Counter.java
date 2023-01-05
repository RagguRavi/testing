package functional_programming.concurrency;

public class Counter {
	private int i=0;
	private int j=0;
	
	synchronized void increment() {
		System.out.println("incrementing I "+i);
		i++;
	}
	
	int get() {
		return i;
	}
	
	synchronized void incrementJ() {
		System.out.println("incrementing J "+j);
		j++;
	}
	
	int getJ() {
		return j;
	}
	
	synchronized void check1() {
		System.out.println("in Check1");
		for(int i=0;i<10;i++) {
			System.out.print(i +" ");
		}
	}
	
	synchronized void check2() {
		System.out.println("In check2");
		for(int i=11;i<20;i++) {
			System.out.print(i+" ");
		}
	}
}
