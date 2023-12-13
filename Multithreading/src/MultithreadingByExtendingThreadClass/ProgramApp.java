package MultithreadingByExtendingThreadClass;

public class ProgramApp {
	public static void main(String[] args) {
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		np.start();
		cp.start();
	}
}
