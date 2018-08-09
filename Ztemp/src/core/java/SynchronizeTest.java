package core.java;

public class SynchronizeTest {

}

class MyThread extends Thread {
	
	
	public void run() {
		
		System.out.println(Thread.currentThread());
	}
}
