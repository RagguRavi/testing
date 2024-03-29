package core.threadTest;

public class Test2 {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		NewThread t1 = new NewThread("one",t);
		NewThread t2 = new NewThread("Two",t);
		NewThread t3 = new NewThread("Three",t);
		
		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		System.out.println(t1.name+" is alive "+t1.t.isAlive());
		System.out.println(t2.name+"  is alive "+t2.t.isAlive());
		System.out.println(t3.name+"  is alive "+t3.t.isAlive());
		
		try {
//			t1.t.join();
//			t2.t.join();
//			t3.t.join();
			
			for(int i=0;i<10;i++) {
				System.out.println(t1.name+" is alive "+t1.t.getState());
				System.out.println(t2.name+"  is alive "+t2.t.getState());
				System.out.println(t3.name+"  is alive "+t3.t.getState());
				Thread.sleep(2000);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.name+" is alive "+t1.t.isAlive());
		System.out.println(t2.name+"  is alive "+t2.t.isAlive());
		System.out.println(t3.name+"  is alive "+t3.t.isAlive());
		
		
		System.out.println("Main thread exiting");
	}
	
	synchronized void print(NewThread th) {
		System.out.println(th.name +": ");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


class NewThread implements Runnable {
	
	String name;
	Thread t;
	Test2 test;

	public NewThread(String name,Test2 test) {
		this.name = name;
		t = new Thread(this,name);
		this.test = test;
		System.out.println("New Thread: "+t);
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5;i>=0;i--) {
				test.print(this);
			}
		} catch (Exception e) {

		}
		
		System.out.println(name +" exiting");
	}
	
	
	
}