package MultithreadingByImplementingRunnableInterface;

public class ProgramApp {
	public static void main(String[] args) {
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		Thread t1 = new Thread(np);
		Thread t2 = new Thread(cp);
		t1.start();
		t2.start();
	}
}
