package functional_programming.ThreadPractice;

public class Task1 extends Thread{

	@Override
	public void run() {
		System.out.println("\nIn Task 1");
		for(int i=1;i<=10;i++) {
			try {
				System.out.print(i+" ");
				 Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nTask1 completed");
	}
}
