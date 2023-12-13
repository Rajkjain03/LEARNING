package MultithreadingUsingSingleRunMethodByImplementingRunnableInterface;

public class ProgramApp {
	public static void main(String[] args) {
		Program p = new Program();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
	}
}
