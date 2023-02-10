package core.collectionTest;

public class Threading1 {
	public static void main(String args[]) {
		Threading1 th = new Threading1();
		
		Thread t1 = new Thread(new PrintOdd(th),"Odd Thread");
		Thread t2 = new Thread(new PrintEven(th),"Even Thread");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
			System.out.println("Ending main method");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 synchronized void printNumber(int no) {
		System.out.println(Thread.currentThread().getName()+"\t" + no);
		try {
			this.notifyAll();
			this.wait();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

class PrintOdd implements Runnable {
	Threading1 th;
	
	public PrintOdd(Threading1 th) {
		this.th = th;
	}
	@Override
	public void run() {
		for(int i=1;i<50;i=i+2) {
			th.printNumber(i);
			try {
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			System.out.println("I am here");
		}
		
		
	}
}

class PrintEven implements Runnable {
Threading1 th;
	
	public PrintEven(Threading1 th) {
		this.th = th;
	}
	@Override
	public void run() {
		for(int i=2;i<50;i=i+2) {
			th.printNumber(i);
			try {
//				Thread.sleep(1000);
//				th.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			System.out.println("I am here 2");
		}
		
	}
	
}