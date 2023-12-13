package SingleThreading;

public class Changes {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		//changing thread name
		t.setName("My Thread");
		//changing thread priority
		t.setPriority(9);
		
		System.out.println(t);
	}
}
