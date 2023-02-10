package functional_programming.ThreadPractice;

public class Task3 extends Thread{

	@Override
	public void run() {
		System.out.println("\nIn Task 3");
		for(int i=31;i<=40;i++) {
			try {
				System.out.print(i+" ");
				 Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nTask3 completed");
	}
}
