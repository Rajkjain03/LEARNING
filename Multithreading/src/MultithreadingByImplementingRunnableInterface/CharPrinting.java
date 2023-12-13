package MultithreadingByImplementingRunnableInterface;

public class CharPrinting implements Runnable{
	public void run() {
		System.out.println("Printing char started");
		for(char i='A'; i<='E'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing char ended");
	}
}
