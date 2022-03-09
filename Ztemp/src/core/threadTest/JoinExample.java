package core.threadTest;

public class JoinExample {
	public static Thread currentThread;
	public static void main(String[] args) {
		currentThread = Thread.currentThread();
		try {
			JoinThread t = new JoinThread();

			t.start();
			
			
			t.join();
			System.out.println("Main method about to close");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


class JoinThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i = 0;i<10;i++) {
				System.out.println("Thread running count: "+i);
				Thread.sleep(1000);
				
				if(i ==5) {
					intruptThread t = new intruptThread();
					t.start();
					intruptThread.intruptThread =  JoinExample.currentThread;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class intruptThread extends Thread {
	public static Thread intruptThread;
	
	@Override
	public void run() {
		intruptThread.interrupt();
	}
}