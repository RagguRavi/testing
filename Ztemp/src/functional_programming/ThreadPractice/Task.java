package functional_programming.ThreadPractice;

public class Task implements Runnable {
	String name;
	int no;
	
	Task(int no) {
		this.no=no;
	}
	
	@Override
	public void run() {
		System.out.println("\nIn Task "+no);
		for(int i=no*10;i<=no*10+10;i++) {
			try {
				System.out.print(i+" ");
				 Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nTask"+no+" completed");
	}

}
