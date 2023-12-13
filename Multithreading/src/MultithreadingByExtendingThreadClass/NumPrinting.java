package MultithreadingByExtendingThreadClass;

public class NumPrinting extends Thread{
	public void run() {
		System.out.println("Printing number started");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing num ended");
	}
}
