package MultithreadingInSynchronizedEnvironment;

public class KodLibrary implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() +" is taking the book");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() +" is reading the book");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() +" is returning the book");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
