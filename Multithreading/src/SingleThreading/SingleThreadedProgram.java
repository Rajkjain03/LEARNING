package SingleThreading;

public class SingleThreadedProgram {
	public static void main(String[] args) {
		printNum();
		printChar();
	}
	
	public static void printNum() {
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
	
	public static void printChar() {
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
