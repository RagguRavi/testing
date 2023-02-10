package functional_programming.ThreadPractice;

public class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nIn Task 2");
		for(int i=21;i<=30;i++) {
			try {
				System.out.print(i+" ");
				 Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nTask2 completed");
	}
}
