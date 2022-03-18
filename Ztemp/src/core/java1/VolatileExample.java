package core.java1;

public class VolatileExample {
	public static int i=0;
	
	public static void main(String args[]) {
		T1 t1 = new T1();
		t1.setName("Ravi");
		
		t1.start();
		
		T2 t2 = new T2();
		t2.setName("Nitin");
		
		t2.start();
		
		
		/*
		 * T2 t3 = new T2(); t3.setName("RONI");
		 * 
		 * t3.start();
		 */
	}
}



class T1 extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am in thread "+this.getName() +" and value is: "+VolatileExample.i);
				VolatileExample.i += 1;
				Thread.sleep(500);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


class T2 extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am in thread "+this.getName() +" and value is: "+VolatileExample.i);
				VolatileExample.i -= 1;
				Thread.sleep(500);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
