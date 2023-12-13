package MultithreadingInSynchronizedEnvironment;

public class KodLibraryApp {
	public static void main(String[] args) {
		KodLibrary kl = new KodLibrary();
		Thread t1 = new Thread(kl);
		Thread t2 = new Thread(kl);
		t1.start();
		t2.start();
	}
}
