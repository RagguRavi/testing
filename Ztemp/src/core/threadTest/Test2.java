package core.threadTest;

public class Test2 {
	static int limit = 50;
	int count = 1;
	public static void main(String args[]) {
		Test2 t = new Test2();
		
		Runnable t1 = () -> {
			t.printOdd();
		};
		
		Runnable t2 = () -> {
			t.printEven();
		};
		
		new Thread(t1,"Thread one").start();
		new Thread(t2,"Thread Two").start();
		
		System.out.println("Thread Ends");
	}
	
	synchronized void printOdd() {
		try {
			while(count< limit) {

				if(count % 2 == 0) {
					wait();
				}

				System.out.println(Thread.currentThread().getName() +"  "+ count);
				notify();
				count++;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized void printEven()  {
		try {
			while(count< limit) {

				if(count % 2 > 0) {
					wait();
				}

				System.out.println(Thread.currentThread().getName() +"  "+ count);
				notify();
				count++;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	 public void test() {
		try {
			synchronized (this) {
				for(int i = 0; i<10;i++) {

					System.out.println(Thread.currentThread().getName() );
					Thread.sleep(500);
					System.out.println("Hey I am here");
				}

			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
