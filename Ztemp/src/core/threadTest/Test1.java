package core.threadTest;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * T1 t1 = new T1(); t1.setName("ravi");
		 * 
		 * t1.start();
		 */
		
		T2 t2 = new T2("Nitin");
		Thread thread = new Thread(t2,t2.tName);
		
		
		T2 t3 = new T2("Ravi");
		Thread thread2 = new Thread(t3,t3.tName);
		
	
		thread2.start();
		thread.start();
		
		
		
		
		
	}
}

 class T1 extends Thread {
	@Override
	public void run() {
		System.out.println("Hey this thread is creating by extends thread"+Thread.currentThread()+" "+this.getId());
	}
}



class T2 implements Runnable {
	String tName;
	
	public T2(String tName) {
		this.tName = tName;
	}
	@Override
	public void run() {
		try {
			for(int i = 0;i<10;i++) {
				System.out.println("Running Thread"+i+" Thread Name: "+tName);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}